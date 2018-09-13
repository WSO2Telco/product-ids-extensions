package com.wso2telco.mbss.password.history.manager;

public class Constants {
    public static final String CONFIG_FILE_NAME = "password-history-identity-mgt.properties";

    public static final String HISTORY_ENABLE = "PasswordHistory.Enable";

    public static final String HISTORY_COUNT = "PasswordHistory.Count";

    public static final String HISTORY_TIME = "PasswordHistory.Time";


    public static final String PASSWORD_HISTORY_HASHING_ALGORITHM = "PasswordHistory.hashingAlgorithm";
    public static final String PASSWORD_HISTORY_DATA_STORE = "PasswordHistory.dataStore";


    public static class SQLQueries {

        public static final String STORE_HISTORY_DATA = "INSERT INTO  IDN_PASSWORD_HISTORY_DATA "
                + "(USER_NAME, USER_DOMAIN, TENANT_ID, SALT_VALUE, HASH, TIME_CREATED)"
                + "VALUES (?,?,?,?,?,?)";
        public static final String LOAD_HISTORY_DATA = "SELECT * FROM IDN_PASSWORD_HISTORY_DATA WHERE USER_NAME= ? AND " +
                "USER_DOMAIN = ? AND TENANT_ID = ? ORDER BY TIME_CREATED DESC  ";

        public static final String DELETE_HISTORY_RECORD = "DELETE FROM IDN_PASSWORD_HISTORY_DATA WHERE ID=?";

        public static final String DELETE_USER_HISTORY = "DELETE FROM IDN_PASSWORD_HISTORY_DATA WHERE USER_NAME = ? " +
                "AND USER_DOMAIN =? AND TENANT_ID =?";

    }
}