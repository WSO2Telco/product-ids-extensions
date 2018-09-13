package com.wso2telco.mbss.authenticator;

/**
 * Constants used by the BasicAuthenticator
 */
public abstract class MBSSAuthenticatorConstants {

    public static final String AUTHENTICATOR_NAME = "MBSSBasicCustomAuthenticator";
    public static final String AUTHENTICATOR_FRIENDLY_NAME = "MBSSBasicAuthenticator";
    public static final String USER_NAME = "username";
    public static final String PASSWORD = "password";

    //password change constants
    public static final String CURRENT_PASSWORD = "CURRENT_PWD";
    public static final String NEW_PASSWORD = "NEW_PWD";
    public static final String NEW_PASSWORD_CONFIRM = "NEW_PWD_CONFIRMATION";


    public static final String ACCOUNT_SUSPENDED_CLAIM = "http://wso2.org/claims/identity/accountSuspended";
    public static final String LAST_PASSWORD_CHANGE_CLAIM = "http://wso2.org/claims/identity/lastPasswordUpdateTime";

    public static final String FAILED_REASON = "authorizationFailedReason";
    public static final String FAILED_REASON_CAUSE = "authorizationFailedReasonCause";
    public static final String FAILED_REASON_ACCOUNT_SUSPENDED = "accountSuspended";
    public static final String FAILED_REASON_SESSION_LIMIT = "sessionLimitExceeded";
    public static final String FAILED_REASON_INVALID_CREDENTIALS = "invalidCredentials";
    public static final String FAILED_REASON_UNKNOWN = "unknownReason";
    public static final String FAILED_REASON_OUTSIDE_WORKING_HOURS = "outsideWorkingHours";
    public static final String FAILED_REASON_PASSWORD_EXPIRED = "passwordExpired";

    public static final String FAILED_REASON_PASSWORDS_DO_NOT_MATCH = "passwordsDoNotMatch";
    public static final String REASON_PASSWORD_CHANGE_SUCCESS = "passwordChanged";
    public static final String FAILED_REASON_PASSWORD_CHANGE_FAILED = "passwordChangeFailed";
    public static final String FAILED_REASON_PASSWORD_REJECTED = "passwordRejectedByPolicy";
    public static final String FAILED_REASON_INVALID_CURRENT_PASSWORD = "invalidCurrentPassword";


    public static final String MBSS_AUTHENTICATOR_CONFIG_FILE_NAME = "mbss-authenticator-config.xml";
}