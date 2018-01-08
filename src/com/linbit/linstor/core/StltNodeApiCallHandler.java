package com.linbit.linstor.core;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.locks.Lock;

import com.linbit.ImplementationError;
import com.linbit.InvalidIpAddressException;
import com.linbit.InvalidNameException;
import com.linbit.SatelliteTransactionMgr;
import com.linbit.linstor.LsIpAddress;
import com.linbit.linstor.NetInterface;
import com.linbit.linstor.NetInterfaceData;
import com.linbit.linstor.NetInterfaceName;
import com.linbit.linstor.Node;
import com.linbit.linstor.Node.NodeFlag;
import com.linbit.linstor.Node.NodeType;
import com.linbit.linstor.NodeConnectionData;
import com.linbit.linstor.NodeData;
import com.linbit.linstor.NodeName;
import com.linbit.linstor.Resource;
import com.linbit.linstor.api.interfaces.serializer.StltRequestSerializer;
import com.linbit.linstor.api.pojo.NodePojo;
import com.linbit.linstor.api.pojo.NodePojo.NodeConnPojo;
import com.linbit.linstor.security.AccessContext;
import com.linbit.linstor.security.AccessDeniedException;
import java.util.Iterator;

class StltNodeApiCallHandler
{
    private Satellite satellite;
    private AccessContext apiCtx;
    private StltRequestSerializer<NodeName> nodeRequestSerializer;

    public StltNodeApiCallHandler(Satellite satelliteRef, AccessContext apiCtxRef, StltRequestSerializer<NodeName> nodeRequestSerializer)
    {
        satellite = satelliteRef;
        apiCtx = apiCtxRef;
        this.nodeRequestSerializer = nodeRequestSerializer;
    }

    public void requestChange(Node node)
    {
        // TODO: implement
    }

    public void applyChanges(NodePojo nodePojo)
    {
        try
        {
            SatelliteTransactionMgr transMgr = new SatelliteTransactionMgr();

            Node node = applyChanges(nodePojo, transMgr);
            NodeName nodeName = new NodeName(nodePojo.getName());
            transMgr.commit();

            // BEGIN EXPERIMENTAL SECTION
            // FIXME: This should probably be moved to a more central location in the code,
            //        where the satellite can figure out, which nodes, resource definitions,
            //        resources, etc. are replaced at the same time, and then avoid
            //        unnecessary updating of objects that are going to be replaced
            //        in the next step.
            //        Also, this section needs to be checked for collisions with possibly existing
            //        other code that also attempts to update references between nodes and resources.
            Node replacedNode = satellite.nodesMap.get(nodeName);
            if (replacedNode != null)
            {
                Iterator<Resource> rscIter = replacedNode.iterateResources(apiCtx);
                while (rscIter.hasNext())
                {
                    Resource rsc = rscIter.next();
                    // Update the existing resource to reference the new node object
                    rsc.setAssignedNode(apiCtx, node);
                    // Update the new node object to reference the resource object
                    node.addResource(apiCtx, rsc);
                }
            }
            // END EXPERIMENTAL SECTION

            satellite.nodesMap.put(nodeName, node);
            satellite.getErrorReporter().logInfo("Node '" + nodePojo.getName() + "' created.");
            Set<NodeName> updatedNodes = new TreeSet<>();
            updatedNodes.add(new NodeName(nodePojo.getName()));
            satellite.getDeviceManager().nodeUpdateApplied(updatedNodes);
        }
        catch (Exception | ImplementationError exc)
        {
            // TODO: kill connection?
            satellite.getErrorReporter().reportError(exc);
        }
    }

    public NodeData applyChanges(NodePojo nodePojo, SatelliteTransactionMgr transMgr)
        throws DivergentUuidsException, ImplementationError, InvalidNameException, AccessDeniedException,
        SQLException, InvalidIpAddressException
    {
        Lock reConfReadLock = satellite.reconfigurationLock.readLock();
        Lock nodesWriteLock = satellite.nodesMapLock.writeLock();

        try
        {
            reConfReadLock.lock();
            nodesWriteLock.lock();

            NodeFlag[] nodeFlags = NodeFlag.restoreFlags(nodePojo.getNodeFlags());
            NodeData node = NodeData.getInstanceSatellite(
                apiCtx,
                nodePojo.getUuid(),
                new NodeName(nodePojo.getName()),
                NodeType.valueOf(nodePojo.getType()),
                nodeFlags,
                transMgr
            );
            checkUuid(node, nodePojo);

            node.getFlags().resetFlagsTo(apiCtx, nodeFlags);

            Map<String, String> map = node.getProps(apiCtx).map();
            map.clear();
            map.putAll(nodePojo.getProps());

            for (NodeConnPojo nodeConn : nodePojo.getNodeConns())
            {
                NodeData otherNode = NodeData.getInstanceSatellite(
                    apiCtx,
                    nodeConn.getOtherNodeUuid(),
                    new NodeName(nodeConn.getOtherNodeName()),
                    NodeType.valueOf(nodeConn.getOtherNodeType()),
                    NodeFlag.restoreFlags(nodeConn.getOtherNodeFlags()),
                    transMgr
                );
                NodeConnectionData nodeCon = NodeConnectionData.getInstanceSatellite(
                    apiCtx,
                    nodeConn.getNodeConnUuid(),
                    node,
                    otherNode,
                    transMgr
                );
                Map<String, String> props = nodeCon.getProps(apiCtx).map();
                props.clear();
                props.putAll(nodeConn.getNodeConnProps());
            }

            for (NetInterface.NetInterfaceApi netIfApi : nodePojo.getNetInterfaces())
            {
                NetInterfaceName netIfName = new NetInterfaceName(netIfApi.getName());
                LsIpAddress ipAddress = new LsIpAddress(netIfApi.getAddress());
                NetInterface netIf = node.getNetInterface(apiCtx, netIfName);
                if (netIf == null)
                {
                    NetInterfaceData.getInstanceSatellite(
                        apiCtx,
                        netIfApi.getUuid(),
                        node,
                        netIfName,
                        ipAddress,
                        transMgr
                    );
                }
                else
                {
                    netIf.setAddress(apiCtx, ipAddress);
                }
            }
            return node;
        }
        finally
        {
            nodesWriteLock.unlock();
            reConfReadLock.unlock();
        }
    }

    private void checkUuid(NodeData node, NodePojo nodePojo) throws DivergentUuidsException
    {
        checkUuid(
            node.getUuid(),
            nodePojo.getUuid(),
            "Node",
            node.getName().displayValue,
            nodePojo.getName()
        );
    }

    private void checkUuid(UUID localUuid, UUID remoteUuid, String type, String localName, String remoteName)
        throws DivergentUuidsException
    {
        if (!localUuid.equals(remoteUuid))
        {
            throw new DivergentUuidsException(
                type,
                localName,
                remoteName,
                localUuid,
                remoteUuid
            );
        }
    }
}
