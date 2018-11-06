package com.linbit.linstor.security;

public interface GenericDbTestConstants
{
    // View names
    String VIEW_SEC_IDENTITIES_LOAD = "SEC_IDENTITIES_LOAD";
    String VIEW_SEC_ROLES_LOAD      = "SEC_ROLES_LOAD";
    String VIEW_SEC_TYPES_LOAD      = "SEC_TYPES_LOAD";
    String VIEW_SEC_TYPE_RULES_LOAD = "SEC_TYPE_RULES_LOAD";

    // Table names
    String TBL_SEC_CONFIGURATION     = "SEC_CONFIGURATION";
    String TBL_SEC_IDENTITIES        = "SEC_IDENTITIES";
    String TBL_SEC_TYPES             = "SEC_TYPES";
    String TBL_SEC_ROLES             = "SEC_ROLES";
    String TBL_SEC_ID_ROLE_MAP       = "SEC_ID_ROLE_MAP";
    String TBL_SEC_ACCESS_TYPES      = "SEC_ACCESS_TYPES";
    String TBL_SEC_TYPE_RULES        = "SEC_TYPE_RULES";
    String TBL_SEC_DFLT_ROLES        = "SEC_DFLT_ROLES";
    String TBL_SEC_OBJECT_PROTECTION = "SEC_OBJECT_PROTECTION";
    String TBL_SEC_ACL_MAP           = "SEC_ACL_MAP";
    String TBL_NODES                 = "NODES";
    String TBL_NODE_NET_INTERFACES   = "NODE_NET_INTERFACES";
    String TBL_SATELLITE_CONNECTIONS = "SATELLITE_CONNECTIONS";
    String TBL_RESOURCE_DEFINITIONS  = "RESOURCE_DEFINITIONS";
    String TBL_RESOURCES             = "RESOURCES";
    String TBL_STOR_POOL_DEFINITIONS = "STOR_POOL_DEFINITIONS";
    String TBL_NODE_STOR_POOL        = "NODE_STOR_POOL";
    String TBL_VOLUME_DEFINITIONS    = "VOLUME_DEFINITIONS";
    String TBL_VOLUMES               = "VOLUMES";
    String TBL_NODE_CONNECTIONS      = "NODE_CONNECTIONS";
    String TBL_RESOURCE_CONNECTIONS  = "RESOURCE_CONNECTIONS";
    String TBL_VOLUME_CONNECTIONS    = "VOLUME_CONNECTIONS";
    String TBL_PROPS_CONTAINERS      = "PROPS_CONTAINERS";

    // SEC_CONFIGURATION column names
    String ENTRY_KEY     = "ENTRY_KEY";
    String ENTRY_DSP_KEY = "ENTRY_DSP_KEY";
    String ENTRY_VALUE   = "ENTRY_VALUE";

    // SEC_IDENTITIES column names
    String IDENTITY_NAME     = "IDENTITY_NAME";
    String IDENTITY_DSP_NAME = "IDENTITY_DSP_NAME";
    String PASS_SALT         = "PASS_SALT";
    String PASS_HASH         = "PASS_HASH";
    String ID_ENABLED        = "ID_ENABLED";
    String ID_LOCKED         = "ID_LOCKED";

    // SEC_TYPES column names
    String TYPE_NAME     = "TYPE_NAME";
    String TYPE_DSP_NAME = "TYPE_DSP_NAME";
    String TYPE_ENABLED  = "TYPE_ENABLED";

    // SEC_ROLES column names
    String ROLE_NAME       = "ROLE_NAME";
    String ROLE_DSP_NAME   = "ROLE_DSP_NAME";
    String DOMAIN_NAME     = "DOMAIN_NAME";
    String ROLE_ENABLED    = "ROLE_ENABLED";
    String ROLE_PRIVILEGES = "ROLE_PRIVILEGES";

    // SEC_ACCESS_TYPES column names
    String ACCESS_TYPE_NAME  = "ACCESS_TYPE_NAME";
    String ACCESS_TYPE_VALUE = "ACCESS_TYPE_VALUE";

    // SEC_TYPE_RULES column names
    String ACCESS_TYPE = "ACCESS_TYPE";

    // SEC_OBJECT_PROTECTION column names
    String OBJECT_PATH           = "OBJECT_PATH";
    String CREATOR_IDENTITY_NAME = "CREATOR_IDENTITY_NAME";
    String OWNER_ROLE_NAME       = "OWNER_ROLE_NAME";
    String SECURITY_TYPE_NAME    = "SECURITY_TYPE_NAME";

    // NODES column names
    String UUID          = "UUID";
    String NODE_NAME     = "NODE_NAME";
    String NODE_DSP_NAME = "NODE_DSP_NAME";
    String NODE_FLAGS    = "NODE_FLAGS";
    String NODE_TYPE     = "NODE_TYPE";

    // NODE_NET_INTERFACES column names
    String NODE_NET_NAME     = "NODE_NET_NAME";
    String NODE_NET_DSP_NAME = "NODE_NET_DSP_NAME";
    String INET_ADDRESS      = "INET_ADDRESS";

    // RESOURCE_DEFINITIONS column names
    String RESOURCE_NAME     = "RESOURCE_NAME";
    String RESOURCE_DSP_NAME = "RESOURCE_DSP_NAME";
    String RESOURCE_FLAGS    = "RESOURCE_FLAGS";
    String SECRET            = "SECRET";
    String TCP_PORT          = "TCP_PORT";
    String TRANSPORT_TYPE    = "TRANSPORT_TYPE";

    // RESOURCES column names
    String NODE_ID        = "NODE_ID";

    // STOR_POOL_DEFINITIONS column names
    String POOL_NAME     = "POOL_NAME";
    String POOL_DSP_NAME = "POOL_DSP_NAME";

    // NODE_STOR_POOL column names
    String DRIVER_NAME = "DRIVER_NAME";

    // VOLUME_DEFINITIONS column names
    String VLM_NR        = "VLM_NR";
    String VLM_SIZE      = "VLM_SIZE";
    String VLM_MINOR_NR  = "VLM_MINOR_NR";
    String VLM_FLAGS     = "VLM_FLAGS";

    // VOLUMES column names
    String STOR_POOL_NAME    = "STOR_POOL_NAME";

    // NODE_CONNECTIONS column names
    String NODE_NAME_SRC = "NODE_NAME_SRC";
    String NODE_NAME_DST = "NODE_NAME_DST";

    // PROPS_CONTAINERS column names
    String PROPS_INSTANCE = "PROPS_INSTANCE";
    String PROP_KEY       = "PROP_KEY";
    String PROP_VALUE     = "PROP_VALUE";

    // table column counts
    int TBL_COL_COUNT_SEC_CONFIGURATION     = 3;
    int TBL_COL_COUNT_SEC_IDENTITIES        = 6;
    int TBL_COL_COUNT_SEC_TYPES             = 3;
    int TBL_COL_COUNT_SEC_ROLES             = 5;
    int TBL_COL_COUNT_SEC_ID_ROLE_MAP       = 2;
    int TBL_COL_COUNT_SEC_ACCESS_TYPES      = 2;
    int TBL_COL_COUNT_SEC_TYPE_RULES        = 3;
    int TBL_COL_COUNT_SEC_DFLT_ROLES        = 2;
    int TBL_COL_COUNT_SEC_OBJECT_PROTECTION = 4;
    int TBL_COL_COUNT_SEC_ACL_MAP           = 3;
    int TBL_COL_COUNT_NODES                 = 5;
    int TBL_COL_COUNT_NODE_NET_INTERFACES   = 5;
    int TBL_COL_COUNT_RESOURCE_DEFINITIONS  = 7;
    int TBL_COL_COUNT_RESOURCES             = 5;
    int TBL_COL_COUNT_STOR_POOL_DEFINITIONS = 3;
    int TBL_COL_COUNT_NODE_STOR_POOL        = 4;
    int TBL_COL_COUNT_VOLUME_DEFINITIONS    = 6;
    int TBL_COL_COUNT_VOLUMES               = 8;
    int TBL_COL_COUNT_NODE_CONNECTIONS      = 3;
    int TBL_COL_COUNT_RESOURCE_CONNECTIONS  = 6;
    int TBL_COL_COUNT_VOLUME_CONNECTIONS    = 5;
    int TBL_COL_COUNT_PROPS_CONTAINERS      = 3;

    // truncate statements
    String TRUNCATE_PROPS_CONTAINERS      = "DELETE FROM " + TBL_PROPS_CONTAINERS;
    String TRUNCATE_VOLUME_CONNECTIONS    = "DELETE FROM " + TBL_VOLUME_CONNECTIONS;
    String TRUNCATE_RESOURCE_CONNECTIONS  = "DELETE FROM " + TBL_RESOURCE_CONNECTIONS;
    String TRUNCATE_NODE_CONNECTIONS      = "DELETE FROM " + TBL_NODE_CONNECTIONS;
    String TRUNCATE_VOLUMES               = "DELETE FROM " + TBL_VOLUMES;
    String TRUNCATE_VOLUME_DEFINITIONS    = "DELETE FROM " + TBL_VOLUME_DEFINITIONS;
    String TRUNCATE_NODE_STOR_POOL        = "DELETE FROM " + TBL_NODE_STOR_POOL;
    String TRUNCATE_STOR_POOL_DEFINITIONS = "DELETE FROM " + TBL_STOR_POOL_DEFINITIONS;
    String TRUNCATE_RESOURCES             = "DELETE FROM " + TBL_RESOURCES;
    String TRUNCATE_RESOURCE_DEFINITIONS  = "DELETE FROM " + TBL_RESOURCE_DEFINITIONS;
    String TRUNCATE_NODE_NET_INTERFACES   = "DELETE FROM " + TBL_NODE_NET_INTERFACES;
    String TRUNCATE_NODES                 = "DELETE FROM " + TBL_NODES;
    String TRUNCATE_SEC_ACL_MAP           = "DELETE FROM " + TBL_SEC_ACL_MAP;
    String TRUNCATE_SEC_OBJECT_PROTECTION = "DELETE FROM " + TBL_SEC_OBJECT_PROTECTION;
    String TRUNCATE_SEC_DFLT_ROLES        = "DELETE FROM " + TBL_SEC_DFLT_ROLES;
    String TRUNCATE_SEC_TYPE_RULES        = "DELETE FROM " + TBL_SEC_TYPE_RULES;
    String TRUNCATE_SEC_ACCESS_TYPES      = "DELETE FROM " + TBL_SEC_ACCESS_TYPES;
    String TRUNCATE_SEC_ID_ROLE_MAP       = "DELETE FROM " + TBL_SEC_ID_ROLE_MAP;
    String TRUNCATE_SEC_ROLES             = "DELETE FROM " + TBL_SEC_ROLES;
    String TRUNCATE_SEC_TYPES             = "DELETE FROM " + TBL_SEC_TYPES;
    String TRUNCATE_SEC_IDENTITIES        = "DELETE FROM " + TBL_SEC_IDENTITIES;
    String TRUNCATE_SEC_CONFIGURATION     = "DELETE FROM " + TBL_SEC_CONFIGURATION;

    // insert statements (default values)
    String[] INSERT_DEFAULT_VALUES =
    {
        "INSERT INTO SEC_CONFIGURATION (ENTRY_KEY, ENTRY_DSP_KEY, ENTRY_VALUE) \n" +
        "    VALUES ('SECURITYLEVEL', 'SecurityLevel', 'NO_SECURITY')",
        "INSERT INTO SEC_CONFIGURATION (ENTRY_KEY, ENTRY_DSP_KEY, ENTRY_VALUE) \n" +
        "    VALUES ('AUTHREQUIRED', 'AuthRequired', 'false')",
        "INSERT INTO SEC_ACCESS_TYPES (ACCESS_TYPE_NAME, ACCESS_TYPE_VALUE) \n" +
        "    VALUES ('CONTROL', 15)",
        "INSERT INTO SEC_ACCESS_TYPES (ACCESS_TYPE_NAME, ACCESS_TYPE_VALUE) \n" +
        "    VALUES ('CHANGE', 7)",
        "INSERT INTO SEC_ACCESS_TYPES (ACCESS_TYPE_NAME, ACCESS_TYPE_VALUE) \n" +
        "    VALUES ('USE', 3)",
        "INSERT INTO SEC_ACCESS_TYPES (ACCESS_TYPE_NAME, ACCESS_TYPE_VALUE) \n" +
        "    VALUES ('VIEW', 1)",
        "INSERT INTO SEC_IDENTITIES (IDENTITY_NAME, IDENTITY_DSP_NAME, ID_ENABLED, ID_LOCKED) \n" +
        "    VALUES ('SYSTEM', 'SYSTEM', TRUE, TRUE)",
        "INSERT INTO SEC_IDENTITIES (IDENTITY_NAME, IDENTITY_DSP_NAME, ID_ENABLED, ID_LOCKED) \n" +
        "    VALUES ('PUBLIC', 'PUBLIC', TRUE, TRUE)",
        "INSERT INTO SEC_TYPES (TYPE_NAME, TYPE_DSP_NAME, TYPE_ENABLED) \n" +
        "    VALUES ('SYSTEM', 'SYSTEM', TRUE)",
        "INSERT INTO SEC_TYPES (TYPE_NAME, TYPE_DSP_NAME, TYPE_ENABLED) \n" +
        "    VALUES ('PUBLIC', 'PUBLIC', TRUE)",
        "INSERT INTO SEC_TYPES (TYPE_NAME, TYPE_DSP_NAME, TYPE_ENABLED) \n" +
        "    VALUES ('SHARED', 'SHARED', TRUE)",
        "INSERT INTO SEC_TYPES (TYPE_NAME, TYPE_DSP_NAME, TYPE_ENABLED) \n" +
        "    VALUES ('SYSADM', 'SysAdm', TRUE)",
        "INSERT INTO SEC_TYPES (TYPE_NAME, TYPE_DSP_NAME, TYPE_ENABLED) \n" +
        "    VALUES ('USER', 'User', TRUE)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('SYSTEM', 'SYSTEM', 15)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('SYSTEM', 'PUBLIC', 15)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('SYSTEM', 'SHARED', 15)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('SYSTEM', 'SYSADM', 15)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('SYSTEM', 'USER', 15)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('PUBLIC', 'SYSTEM', 3)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('PUBLIC', 'PUBLIC', 15)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('PUBLIC', 'SHARED', 7)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('PUBLIC', 'SYSADM', 3)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('PUBLIC', 'USER', 3)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('SYSADM', 'SYSTEM', 15)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('SYSADM', 'PUBLIC', 15)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('SYSADM', 'SHARED', 15)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('SYSADM', 'SYSADM', 15)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('SYSADM', 'USER', 15)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('USER', 'SYSTEM', 3)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('USER', 'PUBLIC', 7)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('USER', 'SHARED', 7)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('USER', 'SYSADM', 3)",
        "INSERT INTO SEC_TYPE_RULES (DOMAIN_NAME, TYPE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('USER', 'USER', 15)",
        "INSERT INTO SEC_ROLES (ROLE_NAME, ROLE_DSP_NAME, DOMAIN_NAME, ROLE_ENABLED, ROLE_PRIVILEGES) \n" +
        "    VALUES ('SYSTEM', 'SYSTEM', 'SYSTEM', TRUE, -1)",
        "INSERT INTO SEC_ROLES (ROLE_NAME, ROLE_DSP_NAME, DOMAIN_NAME, ROLE_ENABLED, ROLE_PRIVILEGES) \n" +
        "    VALUES ('PUBLIC', 'PUBLIC', 'PUBLIC', TRUE, 0)",
        "INSERT INTO SEC_ROLES (ROLE_NAME, ROLE_DSP_NAME, DOMAIN_NAME, ROLE_ENABLED, ROLE_PRIVILEGES) \n" +
        "    VALUES ('SYSADM', 'SysAdm', 'SYSADM', TRUE, -1)",
        "INSERT INTO SEC_ROLES (ROLE_NAME, ROLE_DSP_NAME, DOMAIN_NAME, ROLE_ENABLED, ROLE_PRIVILEGES) \n" +
        "    VALUES ('USER', 'User', 'USER', TRUE, 0)",
        "INSERT INTO SEC_ID_ROLE_MAP (IDENTITY_NAME, ROLE_NAME) \n" +
        "    VALUES ('SYSTEM', 'SYSTEM')",
        "INSERT INTO SEC_ID_ROLE_MAP (IDENTITY_NAME, ROLE_NAME) \n" +
        "    VALUES ('PUBLIC', 'PUBLIC')",
        "INSERT INTO SEC_DFLT_ROLES (IDENTITY_NAME, ROLE_NAME) \n" +
        "    VALUES ('SYSTEM', 'SYSTEM')",
        "INSERT INTO SEC_DFLT_ROLES (IDENTITY_NAME, ROLE_NAME) \n" +
        "    VALUES ('PUBLIC', 'PUBLIC')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/PlainConnector/type', 'plain')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/PlainConnector/bindaddress', '::0')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/PlainConnector/port', '3376')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/SslConnector/type', 'ssl')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/SslConnector/bindaddress', '::0')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/SslConnector/port', '3377')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/SslConnector/keyPasswd', 'linstor')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/SslConnector/keyStorePasswd', 'linstor')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/SslConnector/trustStorePasswd', 'linstor')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/SslConnector/trustStore', 'ssl/certificates.jks')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/SslConnector/sslProtocol', 'TLSv1')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/SslConnector/keyStore', 'ssl/keystore.jks')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/DebugSslConnector/type', 'ssl')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/DebugSslConnector/bindaddress', '::0')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/DebugSslConnector/port', '3373')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/DebugSslConnector/keyPasswd', 'linstor')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/DebugSslConnector/keyStorePasswd', 'linstor')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/DebugSslConnector/trustStorePasswd', 'linstor')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/DebugSslConnector/trustStore', 'ssl/certificates.jks')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/DebugSslConnector/sslProtocol', 'TLSv1')",
        "INSERT INTO PROPS_CONTAINERS VALUES ('CTRLCFG', 'netcom/DebugSslConnector/keyStore', 'ssl/keystore.jks')",
        "INSERT INTO SEC_OBJECT_PROTECTION (OBJECT_PATH, CREATOR_IDENTITY_NAME, OWNER_ROLE_NAME, SECURITY_TYPE_NAME) \n" +
        "    VALUES ('/sys/controller/nodesMap', 'SYSTEM', 'SYSADM', 'SHARED')",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/nodesMap', 'SYSTEM', 15)",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/nodesMap', 'USER', 7)",
        "INSERT INTO SEC_OBJECT_PROTECTION (OBJECT_PATH, CREATOR_IDENTITY_NAME, OWNER_ROLE_NAME, SECURITY_TYPE_NAME) \n" +
        "    VALUES ('/sys/controller/rscDfnMap', 'SYSTEM', 'SYSADM', 'SHARED')",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/rscDfnMap', 'SYSTEM', 15)",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/rscDfnMap', 'USER', 7)",
        "INSERT INTO SEC_OBJECT_PROTECTION (OBJECT_PATH, CREATOR_IDENTITY_NAME, OWNER_ROLE_NAME, SECURITY_TYPE_NAME) \n" +
        "    VALUES ('/sys/controller/storPoolMap', 'SYSTEM', 'SYSADM', 'SHARED')",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/storPoolMap', 'SYSTEM', 15)",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/storPoolMap', 'USER', 7)",
        "INSERT INTO SEC_OBJECT_PROTECTION (OBJECT_PATH, CREATOR_IDENTITY_NAME, OWNER_ROLE_NAME, SECURITY_TYPE_NAME) \n" +
        "    VALUES ('/sys/controller/conf', 'SYSTEM', 'SYSADM', 'SYSTEM')",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/conf', 'SYSTEM', 15)",
        "INSERT INTO SEC_OBJECT_PROTECTION (OBJECT_PATH, CREATOR_IDENTITY_NAME, OWNER_ROLE_NAME, SECURITY_TYPE_NAME) \n" +
        "    VALUES ('/sys/controller/shutdown', 'SYSTEM', 'SYSADM', 'SYSTEM')",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/shutdown', 'SYSTEM', 15)",
        "INSERT INTO STOR_POOL_DEFINITIONS VALUES ('622807eb-c8c4-44f0-b03d-a08173c8fa1b', 'DFLTDISKLESSSTORPOOL', 'DfltDisklessStorPool')",
        "INSERT INTO SEC_OBJECT_PROTECTION (OBJECT_PATH, CREATOR_IDENTITY_NAME, OWNER_ROLE_NAME, SECURITY_TYPE_NAME) \n" +
        "    VALUES ('/storpooldefinitions/DFLTDISKLESSSTORPOOL', 'SYSTEM', 'SYSADM', 'SHARED')",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/storpooldefinitions/DFLTDISKLESSSTORPOOL', 'PUBLIC', 7)",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/storpooldefinitions/DFLTDISKLESSSTORPOOL', 'USER', 7)",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/nodesMap', 'PUBLIC', 7)",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/rscDfnMap', 'PUBLIC', 7)",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/storPoolMap', 'PUBLIC', 7)",
        "INSERT INTO SEC_ACL_MAP (OBJECT_PATH, ROLE_NAME, ACCESS_TYPE) \n" +
        "    VALUES ('/sys/controller/conf', 'PUBLIC', 1)",
    };

    // insert statements (parameterized)
    String INSERT_SEC_CONFIGURATION =
        " INSERT INTO " + TBL_SEC_CONFIGURATION +
        " VALUES (?, ?, ?)";
    String INSERT_SEC_IDENTITIES =
        " INSERT INTO " + TBL_SEC_IDENTITIES +
        " VALUES (?, ?, ?, ?, ?, ?)";
    String INSERT_SEC_TYPES =
        " INSERT INTO " + TBL_SEC_TYPES +
        " VALUES (?, ?, ?)";
    String INSERT_SEC_ROLES =
        " INSERT INTO " + TBL_SEC_ROLES +
        " VALUES (?, ?, ?, ?, ?)";
    String INSERT_SEC_ID_ROLE_MAP =
        " INSERT INTO " + TBL_SEC_ID_ROLE_MAP +
        " VALUES (?, ?)";
    String INSERT_SEC_ACCESS_TYPES =
        " INSERT INTO " + TBL_SEC_ACCESS_TYPES +
        " VALUES (?, ?)";
    String INSERT_SEC_TYPE_RULES =
        " INSERT INTO " + TBL_SEC_TYPE_RULES +
        " VALUES (?, ?, ?)";
    String INSERT_SEC_DFLT_ROLES =
        " INSERT INTO " + TBL_SEC_DFLT_ROLES +
        " VALUES (?, ?)";
    String INSERT_SEC_OBJECT_PROTECTION =
        " INSERT INTO " + TBL_SEC_OBJECT_PROTECTION +
        " VALUES (?, ?, ?, ?)";
    String INSERT_SEC_ACL_MAP =
        " INSERT INTO " + TBL_SEC_ACL_MAP +
        " VALUES (?, ?, ?)";
    String INSERT_NODES =
        " INSERT INTO " + TBL_NODES +
        " VALUES (?, ?, ?, ?, ?)";
    String INSERT_NODE_NET_INTERFACES =
        " INSERT INTO " + TBL_NODE_NET_INTERFACES +
        " VALUES (?, ?, ?, ?, ?)";
    String INSERT_SATELLITE_CONNECTIONS =
        " INSERT INTO " + TBL_SATELLITE_CONNECTIONS +
        " VALUES (?, ?, ?, ?, ?)";
    String INSERT_RESOURCE_DEFINITIONS =
        " INSERT INTO " + TBL_RESOURCE_DEFINITIONS +
        " VALUES (?, ?, ?, ?, ?, ?, ?)";
    String INSERT_RESOURCES =
        " INSERT INTO " + TBL_RESOURCES +
        " VALUES (?, ?, ?, ?, ?)";
    String INSERT_STOR_POOL_DEFINITIONS =
        " INSERT INTO " + TBL_STOR_POOL_DEFINITIONS +
        " VALUES (?, ?, ?)";
    String INSERT_NODE_STOR_POOL =
        " INSERT INTO " + TBL_NODE_STOR_POOL +
        " VALUES (?, ?, ?, ?)";
    String INSERT_VOLUME_DEFINITIONS =
        " INSERT INTO " + TBL_VOLUME_DEFINITIONS +
        " VALUES (?, ?, ?, ?, ?, ?)";
    String INSERT_VOLUMES =
        " INSERT INTO " + TBL_VOLUMES +
        " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    String INSERT_NODE_CONNECTIONS =
        " INSERT INTO " + TBL_NODE_CONNECTIONS +
        " VALUES (?, ?, ?)";
    String INSERT_RESOURCE_CONNECTIONS =
        " INSERT INTO " + TBL_RESOURCE_CONNECTIONS +
        " VALUES (?, ?, ?, ?)";
    String INSERT_VOLUME_CONNECTIONS =
        " INSERT INTO " + TBL_VOLUME_CONNECTIONS +
        " VALUES (?, ?, ?, ?, ?)";
    String INSERT_PROPS_CONTAINERS =
        " INSERT INTO " + TBL_PROPS_CONTAINERS +
        " VALUES (?, ?, ?)";

    // truncate statement array
    String[] TRUNCATE_TABLES =
    {
        TRUNCATE_PROPS_CONTAINERS,
        TRUNCATE_VOLUME_CONNECTIONS,
        TRUNCATE_RESOURCE_CONNECTIONS,
        TRUNCATE_NODE_CONNECTIONS,
        TRUNCATE_VOLUMES,
        TRUNCATE_VOLUME_DEFINITIONS,
        TRUNCATE_NODE_STOR_POOL,
        TRUNCATE_STOR_POOL_DEFINITIONS,
        TRUNCATE_RESOURCES,
        TRUNCATE_RESOURCE_DEFINITIONS,
        TRUNCATE_NODE_NET_INTERFACES,
        TRUNCATE_NODES,
        TRUNCATE_SEC_ACL_MAP,
        TRUNCATE_SEC_OBJECT_PROTECTION,
        TRUNCATE_SEC_DFLT_ROLES,
        TRUNCATE_SEC_TYPE_RULES,
        TRUNCATE_SEC_ACCESS_TYPES,
        TRUNCATE_SEC_ID_ROLE_MAP,
        TRUNCATE_SEC_ROLES,
        TRUNCATE_SEC_TYPES,
        TRUNCATE_SEC_IDENTITIES,
        TRUNCATE_SEC_CONFIGURATION,
    };
}
