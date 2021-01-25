package com.wso2telco.dep.custom.jwt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.apimgt.api.APIManagementException;
import org.wso2.carbon.apimgt.keymgt.service.TokenValidationContext;
import org.wso2.carbon.apimgt.keymgt.token.JWTGenerator;
import java.util.*;

public class JWTGeneratorWithoutEscapedURL extends JWTGenerator {

    private static final Log log = LogFactory.getLog(JWTGeneratorWithoutEscapedURL.class);

    public JWTGeneratorWithoutEscapedURL() {
    }

    @Override
    public String buildBody(TokenValidationContext validationContext) throws APIManagementException {
		String originalBody = super.buildBody(validationContext);
		String normalUrlBody = originalBody.replace("\\/", "/");
		log.debug("JWTGeneratorWithoutEscapedURL-convertedJWTBody:" + normalUrlBody);
		return normalUrlBody;
    }

}
