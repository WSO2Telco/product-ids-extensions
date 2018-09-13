package com.wso2telco.mbss.password.history.manager;

import com.wso2telco.mbss.password.history.manager.store.PasswordHistoryDataStore;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.core.util.IdentityUtil;
import org.wso2.carbon.user.api.RealmConfiguration;
import org.wso2.carbon.user.core.UserStoreException;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Read Password History specific data
 */
public class PasswordHistoryIdentityMgtConfig {

    private static final Log log = LogFactory.getLog(PasswordHistoryIdentityMgtConfig.class);
    private static PasswordHistoryIdentityMgtConfig passwordHistoryIdentityMgtConfig;
    private boolean passwordHistoryEnable = false;
    private int passwordHistoryCount = 0;
    private String passwordHistoryDigestAlgo = "SHA-256";
    private String passwordHistoryDataStoreClass = "DefaultPasswordHistoryDataStore";
    private int passwordHistoryTimeInHours = 0;

    protected Properties properties = new Properties();

    /*
     * Define the pattern of the configuration file. Assume following
     * pattern in config.
     * Eg. Password.policy.extensions.1.min.length=6
     */
    private Pattern propertyPattern = Pattern.compile("(\\.\\d\\.)");

    public PasswordHistoryIdentityMgtConfig(RealmConfiguration configuration) {

        InputStream inStream = null;

        File pipConfigXml = new File(IdentityUtil.getIdentityConfigDirPath(), Constants.CONFIG_FILE_NAME);
        if (pipConfigXml.exists()) {
            try {
                inStream = new FileInputStream(pipConfigXml);
                properties.load(inStream);
            } catch (FileNotFoundException e) {
                log.error("Can not load identity-mgt properties file ", e);
            } catch (IOException e) {
                log.error("Can not load identity-mgt properties file ", e);
            } finally {
                if (inStream != null) {
                    try {
                        inStream.close();
                    } catch (IOException e) {
                        log.error("Error while closing stream ", e);
                    }
                }
            }
        }

        try {

            String historyEnableProperty = properties.
                    getProperty(Constants.HISTORY_ENABLE);
            if (StringUtils.isNotBlank(historyEnableProperty)) {
                this.passwordHistoryEnable = Boolean.parseBoolean(historyEnableProperty);
            }

            String passwordHistoryCountProperty = properties.
                    getProperty(Constants.HISTORY_COUNT);
            if (StringUtils.isNumeric(passwordHistoryCountProperty)) {
                this.passwordHistoryCount = Integer.parseInt(passwordHistoryCountProperty);
            }

            String passwordHistoryDigestProperty = properties.
                    getProperty(Constants.PASSWORD_HISTORY_HASHING_ALGORITHM);
            if (StringUtils.isNotBlank(passwordHistoryDigestProperty)) {
                this.passwordHistoryDigestAlgo = passwordHistoryDigestProperty;
            }

            String passwordHistoryDataStoreProperty = properties.
                    getProperty(Constants.PASSWORD_HISTORY_DATA_STORE);
            if (StringUtils.isNotBlank(passwordHistoryDataStoreProperty)) {
                this.passwordHistoryDataStoreClass = passwordHistoryDataStoreProperty;
            }

            String minPasswordNotChangeHours = properties.
                    getProperty(Constants.HISTORY_TIME);
            if (StringUtils.isNumeric(minPasswordNotChangeHours)) {
                this.passwordHistoryTimeInHours = Integer.parseInt(minPasswordNotChangeHours);
            }


        } catch (Exception e) {
            log.error("Error while loading identity mgt configurations", e);
        }
    }

    public boolean isPasswordHistoryEnable() {
        return passwordHistoryEnable;
    }

    public int getPasswordHistoryCount() {
        return passwordHistoryCount;
    }

    public String getPasswordHistoryDataStoreClass() {
        return passwordHistoryDataStoreClass;
    }

    public String getPasswordHistoryDigestAlgo() {
        return passwordHistoryDigestAlgo;
    }

    public int getPasswordHistoryTimeInHours() {
        return passwordHistoryTimeInHours;
    }

    /**
     * Gets instance
     * <p/>
     * As this is only called in start up syn and null check is not needed
     *
     * @param configuration a primary <code>RealmConfiguration</code>
     * @return <code>PasswordHistoryIdentityMgtConfig</code>
     */
    public static PasswordHistoryIdentityMgtConfig getInstance(RealmConfiguration configuration) {

        passwordHistoryIdentityMgtConfig = new PasswordHistoryIdentityMgtConfig(configuration);
        return passwordHistoryIdentityMgtConfig;
    }

    public static PasswordHistoryIdentityMgtConfig getInstance() {
        return passwordHistoryIdentityMgtConfig;
    }


    public PasswordHistoryDataStore getPasswordHistoryDataStore() throws UserStoreException {
        try {
            Class<?> cls = Class.forName(passwordHistoryDataStoreClass);
            Class[] parameterTypes = new Class[]{String.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE};
            Constructor<?> cons = cls.getConstructor(parameterTypes);
            Object[] arguments = {passwordHistoryDigestAlgo, passwordHistoryCount, passwordHistoryTimeInHours};
            PasswordHistoryDataStore passwordHistoryDataStoreObject = (PasswordHistoryDataStore) cons.newInstance(arguments);
            return passwordHistoryDataStoreObject;
        } catch (Exception e) {
            throw new UserStoreException("Error while getting password history data store", e);
        }
    }
}
