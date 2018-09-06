package org.wso2.carbon.identity.password.history.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.wso2.carbon.identity.application.common.model.Property;

public class PropertyFileReader {

	private static Log log = LogFactory.getLog(PropertyFileReader.class);
	private static PropertyFileReader propertyFileReader = null;
    private static final String ACCOUNT_SUSPENSION_PROPERTIES_FILE = "accountsuspension.properties";

	private PropertyFileReader() {
	}

	public Property[] getAccountSuspensionProperties() {
		Property[] resultProperties = new Property[6];
		try {
		    String carbonHome = System.getProperty("carbon.home");
			String accountSuspensionPropertiesFile = carbonHome + "/repository/conf/" + ACCOUNT_SUSPENSION_PROPERTIES_FILE;
		    Properties props = PropertyFileReader.getFileReader().getProperties(accountSuspensionPropertiesFile);
		    
		    Set<String> keys = props.stringPropertyNames();
		    int i = 0;
		    for (String key : keys) {
		    	Property prop = new Property();
		    	prop.setName(key);
		    	prop.setValue(props.getProperty(key));
		    	resultProperties[i] = prop;
		    	i++;
		    }
		} catch (Exception e) {
            log.error("Error occurred while get account suspension properties", e);
		}
		return resultProperties;
	}

	public static PropertyFileReader getFileReader() {
		if (propertyFileReader == null) {
			propertyFileReader = new PropertyFileReader();
		}
		return propertyFileReader;
	}

	private Properties getProperties(String fileName) {
		String configPath = fileName;
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(configPath));
		} catch (FileNotFoundException e) {
			log.error("Error while loading " + fileName + ".properties file", e);
		} catch (IOException e) {
			log.error("Error while loading " + fileName + ".properties file", e);
		} catch (Exception e) {
			log.error("Error while loading " + fileName + ".properties file", e);
		}
		return props;
	}
}
