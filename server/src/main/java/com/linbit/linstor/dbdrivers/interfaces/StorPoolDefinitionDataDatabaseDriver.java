package com.linbit.linstor.dbdrivers.interfaces;

import com.linbit.linstor.core.objects.StorPoolDefinitionData;
import com.linbit.linstor.dbdrivers.DatabaseException;

/**
 * Database driver for {@link com.linbit.linstor.core.objects.StorPoolDefinitionData}.
 *
 * @author Gabor Hernadi &lt;gabor.hernadi@linbit.com&gt;
 */
public interface StorPoolDefinitionDataDatabaseDriver extends GenericDatabaseDriver<StorPoolDefinitionData>
{
    StorPoolDefinitionData createDefaultDisklessStorPool() throws DatabaseException;
}
