package org.wso2.carbon.identity.data.publisher.session;

public class AuthPublisherConstants {

    private AuthPublisherConstants() {

    }
    // Stream definition names
    public static final String AUTHN_DATA_STREAM_NAME = "org.wso2.is.analytics.stream.OverallAuthentication:1.0.0";
    public static final String SESSION_DATA_STREAM_NAME = "org.wso2.is.analytics.stream.OverallSession:1.0.0";

    // Event types
    public static final String STEP_EVENT = "step";
    public static final String OVERALL_EVENT = "overall";

    // Publisher names
    public static final String DAS_LOGIN_PUBLISHER_NAME = "DB_LOGIN_DATA_PUBLISHER";
    public static final String DAS_SESSION_PUBLISHER_NAME = "DB_SESSION_DATA_PUBLISHER";

    public static final String CONFIG_PREFIX = "ISAnalytics.DefaultValues.";
    public static final String USERNAME = "userName";
    public static final String SESSION_ID = "sessionId";
    public static final String TENANT_ID = "tenantId";
    public static final String RELYING_PARTY = "relyingParty";
    public static final String AUTHENTICATED_IDPS = "authenticatedIDPs";
    public static final String SUBJECT_IDENTIFIER = "subjectIdentifier";
    public static final String USER_STORE_DOMAIN = "userStoreDomain";
    public static final String ROLES = "rolesCommaSeperated";
    public static final String SERVICE_PROVIDER = "serviceprovider";
    public static final String IDENTITY_PROVIDER = "identityProvider";
    public static final String NOT_AVAILABLE = "NOT_AVAILABLE";
    public static final String SHA_256 = "SHA-256";
    public static final String USER_AGENT = "User-Agent";

    // Session status codes
    public static final int SESSION_CREATION_STATUS = 1;
    public static final int SESSION_TERMINATION_STATUS = 0;
    public static final int SESSION_UPDATE_STATUS = 2;

}
