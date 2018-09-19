package com.wso2telco.mbss.authenticator.util;

import com.wso2telco.mbss.authenticator.MBSSAuthenticatorConstants;
import com.wso2telco.mbss.authenticator.model.MBSSAuthenticatorConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.utils.CarbonUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * The Class ConfigLoader.
 */
public class ConfigLoader {

    /**
     * The log.
     */
    private Log log = LogFactory.getLog(ConfigLoader.class);

    /**
     * MBSS authenticator configurations
     */
    private MBSSAuthenticatorConfig mbssAuthenticatorConfig;

    /**
     * The loader.
     */
    private static ConfigLoader loader = new ConfigLoader();

    /**
     * Instantiates a new config loader.
     */
    private ConfigLoader() {
        try {
            if (this.mbssAuthenticatorConfig == null) {
                this.mbssAuthenticatorConfig = initMbssAuthenticatorConfig();
            }
        } catch (JAXBException e) {
            log.error("Error while initiating custom config files", e);
        }
    }

    /**
     * Gets the single instance of ConfigLoader.
     *
     * @return single instance of ConfigLoader
     */
    public static ConfigLoader getInstance() {
        return loader;
    }

    /**
     * Resets the singleton and re-initiate
     */
    public static void reset() {
        loader = new ConfigLoader();
    }

    private MBSSAuthenticatorConfig initMbssAuthenticatorConfig() throws JAXBException {
        String configPath = CarbonUtils.getCarbonConfigDirPath() + File.separator
                + MBSSAuthenticatorConstants.MBSS_AUTHENTICATOR_CONFIG_FILE_NAME;

        File file = new File(configPath);
        JAXBContext ctx = JAXBContext.newInstance(MBSSAuthenticatorConfig.class);
        Unmarshaller um = ctx.createUnmarshaller();
        return (MBSSAuthenticatorConfig) um.unmarshal(file);
    }


    public MBSSAuthenticatorConfig getMbssAuthenticatorConfig() {
        return mbssAuthenticatorConfig;
    }
}
