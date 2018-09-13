package org.wso2.carbon.identity.data.publisher.session.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.data.publisher.session.model.SessionData;

import javax.naming.ConfigurationException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataPublisherDbUtil {
    private static volatile DataSource carbonDbDatasource = null;
    private static final Log log = LogFactory.getLog(DataPublisherDbUtil.class);

    private static void initializeConnectDatasource() throws NamingException {
        if (carbonDbDatasource != null) {
            return;
        }

        String dataSourceName = null;
        try {
            Context ctx = new InitialContext();
            carbonDbDatasource = (DataSource) ctx.lookup("jdbc/WSO2IDENTITY_DB");
        } catch (NamingException e) {
            throw new ConfigurationException("DataSource could not be found in mobile-connect.xml:" + e);
        }
    }

    private static Connection getIdentityDbConnection() throws SQLException {
        try {
            initializeConnectDatasource();
        } catch (NamingException e) {
            log.error("Error initializing carbonDb datasource", e);
            return null;
        }

        return carbonDbDatasource.getConnection();
    }

    public static void publishSessionData(SessionData<Object, Object> sessionData) throws SQLException {
        String sql = "INSERT INTO IDN_AUTH_SESSION_INFO (SESSION_ID, USERNAME, SERVICE_PROVIDER, START_TIME, " +
                "RENEW_TIME, TERMINATION_TIME) " +
                "VALUES (?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE " +
                "START_TIME = ?, RENEW_TIME = ?, TERMINATION_TIME = ?";

        Connection connection = getIdentityDbConnection();
        PreparedStatement prep = connection.prepareStatement(sql);
        prep.setString(1, sessionData.getSessionId());
        prep.setString(2, sessionData.getUser());
        prep.setString(3, sessionData.getServiceProvider());
        prep.setLong(4, sessionData.getCreatedTimestamp());
        prep.setLong(5, sessionData.getUpdatedTimestamp());
        prep.setLong(6, sessionData.getTerminationTimestamp());
        prep.setLong(7, sessionData.getCreatedTimestamp());
        prep.setLong(8, sessionData.getUpdatedTimestamp());
        prep.setLong(9, sessionData.getTerminationTimestamp());

        int rowsUpdated = prep.executeUpdate();
        if (rowsUpdated == 0) {
            log.warn("Publish session data: Database update performed 0 row updates");
        }
        connection.commit();
        prep.close();
    }

    public static void terminateSession(String sessionId) throws SQLException {
        String sql = "DELETE FROM IDN_AUTH_SESSION_INFO WHERE SESSION_ID = ?";
        Connection con = getIdentityDbConnection();
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setString(1, sessionId);
        prep.executeUpdate();
        prep.close();
    }
}
