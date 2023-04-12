package com.linbit.linstor.dbdrivers;

import com.linbit.linstor.core.objects.StorPool;
import com.linbit.linstor.dbdrivers.interfaces.LayerResourceIdDatabaseDriver;
import com.linbit.linstor.dbdrivers.interfaces.StorageLayerDatabaseDriver;
import com.linbit.linstor.dbdrivers.interfaces.updater.SingleColumnDatabaseDriver;
import com.linbit.linstor.storage.data.provider.StorageRscData;
import com.linbit.linstor.storage.interfaces.categories.resource.VlmProviderObject;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SatelliteStorageLayerDriver implements StorageLayerDatabaseDriver
{
    private static final LayerResourceIdDatabaseDriver NO_OP_ID_DRIVER = new SatelliteLayerResourceIdDriver();
    private static final SingleColumnDatabaseDriver<?, ?> NO_OP_SINGLE_COL_DRIVER = new SatelliteSingleColDriver<>();

    @Inject
    public SatelliteStorageLayerDriver()
    {
    }

    @Override
    public void persist(StorageRscData<?> storageRscDataRef)
    {
        // no-op
    }

    @Override
    public void delete(StorageRscData<?> storgeRscDataRef)
    {
        // no-op
    }

    @Override
    public void persist(VlmProviderObject<?> vlmDataRef)
    {
        // no-op
    }

    @Override
    public void delete(VlmProviderObject<?> vlmDataRef)
    {
        // no-op
    }

    @Override
    public LayerResourceIdDatabaseDriver getIdDriver()
    {
        return NO_OP_ID_DRIVER;
    }

    @SuppressWarnings("unchecked")
    @Override
    public SingleColumnDatabaseDriver<VlmProviderObject<?>, StorPool> getStorPoolDriver()
    {
        return (SingleColumnDatabaseDriver<VlmProviderObject<?>, StorPool>) NO_OP_SINGLE_COL_DRIVER;
    }
}
