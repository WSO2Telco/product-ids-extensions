============================================================================
Patch ID         : WSO2Telco-MIG-2.2.0-00106
Applies To       : wso2telcoids-2.2.0
Associated JIRA  : https://jira.wso2telco.com/jira/browse/MCSDDEV-173
============================================================================

-----------
DESCRIPTION
-----------

This patch includes the fix to avoid entering username as part of the password field during signup process [API STORE]

-------------------------------------------
CONFIGURATIONS & INSTALLATION INSTRUCTIONS
-------------------------------------------

(i) Copy following artifact from resources/ directory into <IS_HOME>/repository/components/dropins (replace existing ones if needed)
    * password-validator-x.x.x.jar

(ii) Open the identity.xml file found in the <IS_HOME>/repository/conf/identity/ directory and set the org.wso2.carbon.identity.mgt.IdentityMgtEventListener
under the <EventListeners> tag to enable="true".

<EventListener type="org.wso2.carbon.user.core.listener.UserOperationEventListener"
name="org.wso2.carbon.identity.mgt.IdentityMgtEventListener" orderId="50" enable="true"/>

(iii) Open the identity-mgt.properties file found in the <IS_HOME>/repository/conf/identity/ directory and define the following custom classes.

Password.policy.extensions.1=com.wso2telco.password.validator.CustomPasswordPolicy

(iv) Copy patch_mig00106 to <IS_HOME>/repository/components/patches

(v) Restart the IS server

