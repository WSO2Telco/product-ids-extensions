package com.wso2telco.mbss.authenticator.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.naming.ConfigurationException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

public class MBSSAuthenticatorDbUtil {
    private static volatile DataSource carbonDbDatasource = null;
    private static final Log log = LogFactory.getLog(MBSSAuthenticatorDbUtil.class);

    private static void initializeIndentityDatasource() throws NamingException {
        if (carbonDbDatasource != null) {
            return;
        }

        try {
            Context ctx = new InitialContext();
            carbonDbDatasource = (DataSource) ctx.lookup("jdbc/WSO2IDENTITY_DB");
        } catch (NamingException e) {
            throw new ConfigurationException("DataSource could not be found" + e);
        }
    }

    private static Connection getIdentityDbConnection() throws SQLException {
        try {
            initializeIndentityDatasource();
        } catch (NamingException e) {
            log.error("Error initializing carbonDb datasource", e);
            return null;
        }

        return carbonDbDatasource.getConnection();
    }

    private static void closeResources (Connection con, PreparedStatement prep, ResultSet rs) throws SQLException {
        if ((null != con) && (!con.isClosed())) {
            con.close();
        }

        if ((null != prep) && (!prep.isClosed())) {
            prep.close();
        }

        if ((null != rs) && (!rs.isClosed())) {
            rs.close();
        }
    }

    public static int getActiveSessionCount(String key, long sessionTimeout) throws SQLException {
        String keys[] = key.split(":");
        String username = keys[0];
        String serviceProviderName = keys[1];

        long currentTime = System.currentTimeMillis();

        String sql = "SELECT COUNT(SESSION_ID) FROM IDN_AUTH_SESSION_INFO WHERE USERNAME = ? AND " +
                "SERVICE_PROVIDER = ? AND " +
                "(START_TIME + ?) > ?";
        Connection con = getIdentityDbConnection();
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setString(1, username);
        prep.setString(2, serviceProviderName);
        prep.setLong(3, sessionTimeout * 1000); //converting session timeout to milliseconds
        prep.setLong(4, currentTime);
        ResultSet res = prep.executeQuery();

        int activeSessionCount = -1;
        if (res.next()) {
            activeSessionCount = res.getInt(1);
        }
        closeResources(con, prep, res);
        return activeSessionCount;
    }


    public static void removeOutdatedSessionData() {
        String sql = "DELETE FROM IDN_AUTH_SESSION_INFO";
        try {
            Connection con = getIdentityDbConnection();
            PreparedStatement prep = con.prepareStatement(sql);
            prep.executeUpdate();

            closeResources(con, prep, null);
        } catch (SQLException e) {
            log.error("Error removing old session data", e);
        }
    }
}
