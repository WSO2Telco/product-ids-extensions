# identity-governance
Description  :  Account suspension feature

================================================================

System Requirements
a)Java SE Development Kit 1.8
b)wso2telcoids-2.2.0 (WSO2 Identity Server 5.2.0
)
Installation instructions

1) Copy the org.wso2.carbon.identity.account.suspension.notification.task-1.1.28-SNAPSHOT.jar into <IS_HOME>/repository/components/dropins 

2) Create resources/accountsuspension.properties file in the <IS_HOME>/repository/conf/
suspension.notification.enable=true
suspension.notification.account.disable.delay=90
suspension.notification.trigger.time=20:00:00
suspension.notification.delays=30,45,60,75

3) <IS_HOME>/repository/conf/user-mgt.xml under <UserStoreManager class="org.wso2.carbon.user.core.jdbc.JDBCUserStoreManager"> add following
<Property name="NotificationReceiversRetrievalClass">org.wso2.carbon.identity.account.suspension.notification.task.jdbc.JDBCNotificationReceiversRetrieval</Property>

4) From IS carbon console add the below claims for claim dialect http://wso2.org/claims

Display Name			lastLoginTimeAccount
Description				lastLoginTime
Claim Uri				http://wso2.org/claims/identity/lastLoginTime
Mapped Attribute (s)	carLicense
Supported by Default	true

Display Name			Account Suspended
Description				Account Suspended
Claim Uri				http://wso2.org/claims/identity/accountSuspended
Mapped Attribute (s)	accountSuspended
Supported by Default	true

Display Name			Failed Login Attempts
Description				Failed Login Attempts
Claim Uri				http://wso2.org/claims/identity/failedLoginAttempts
Mapped Attribute (s)	failedLoginAttempts
Supported by Default	true
