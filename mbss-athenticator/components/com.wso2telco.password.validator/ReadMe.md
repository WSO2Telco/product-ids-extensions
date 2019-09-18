
DESCRIPTION
-----------

This avoid entering username as part of the password field during signup process [API STORE]


CONFIGURATIONS & INSTALLATION INSTRUCTIONS
-------------------------------------------

(i) Copy following artifact from resources/ directory into <IS_HOME>/repository/components/dropins (replace existing ones if needed)
    * password-validator-x.x.x.jar


(ii) Open the identity-event.properties file found in the <IS_HOME>/repository/conf/identity/ directory and locate the 
config: passwordPolicy.class.PasswordNamePolicy and replace the value with following.

     passwordPolicy.class.PasswordNamePolicy=com.wso2telco.password.validator.CustomPasswordPolicy

(iv) Set the value of "passwordPolicy.enable" to true
     
     passwordPolicy.enable=true

(v) Restart the IS server
