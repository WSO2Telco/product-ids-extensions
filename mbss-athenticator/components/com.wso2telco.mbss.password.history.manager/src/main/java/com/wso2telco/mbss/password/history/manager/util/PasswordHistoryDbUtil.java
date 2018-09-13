package com.wso2telco.mbss.password.history.manager.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.naming.ConfigurationException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PasswordHistoryDbUtil {
    private static volatile DataSource carbonDbDatasource = null;
    private static final Log log = LogFactory.getLog(PasswordHistoryDbUtil.class);

    private static void initializeConnectDatasource() throws NamingException {
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

    public static Connection getIdentityDbConnection() throws SQLException {
        try {
            initializeConnectDatasource();
        } catch (NamingException e) {
            log.error("Error initializing carbonDb datasource", e);
            return null;
        }

        return carbonDbDatasource.getConnection();
    }

    public static void closeResources (Connection con, PreparedStatement prep, ResultSet rs) throws SQLException {
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
}
