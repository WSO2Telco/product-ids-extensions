## Account Suspension & Previous Login Time Features

### System Requirements 
- Java SE Development Kit 1.8
- Wso2telcohub-4.0.1-SNAPSHOT (WSO2 AM Server 2.5)
- Wso2is-km-5.6.0

### Installation Instructions
- Copy the `org.wso2.carbon.identity.account.suspension.notification.task-1.1.0-SNAPSHOT.jar` into `<IS_HOME>/repository/components/dropins` directory
- Copy the `accountsuspension.properties` file into the `<IS_HOME>/repository/conf/`

    ````
    suspension.notification.enable=true
	suspension.notification.account.disable.delay=90
	suspension.notification.trigger.time=20:00:00
	suspension.notification.delays=30,45,60,75
    ````
    
- Open `<IS_HOME>/repository/conf/user-mgt.xml` and add following configuration under `<UserStoreManager class="org.wso2.carbon.user.core.jdbc.JDBCUserStoreManager">`
   
   ```xml
   <Property name="NotificationReceiversRetrievalClass">org.wso2.carbon.identity.account.suspension.notification.task.jdbc.JDBCNotificationReceiversRetrieval</Property>
   ```
   
- Add the below claims from IS carbon console for claim dialect `http://wso2.org/claims`

    ```
    Display Name           PreLastLoginTimeAccount  
    Description            prelastLoginTime
    Claim Uri              http://wso2.org/claims/prelastLoginTime
    Mapped Attribute (s)   prelastLoginTime
    Supported by Default   true
    
    Display Name           lastLoginTimeAccount  
    Description            lastLoginTime
    Claim Uri              http://wso2.org/claims/lastLoginTime
    Mapped Attribute (s)   carLicense
    Supported by Default   true
    
    Display Name           Account Suspended  
    Description            Account Suspended
    Claim Uri              http://wso2.org/claims/identity/accountSuspended
    Mapped Attribute (s)   accountSuspended
    Supported by Default   true

    Display Name           Failed Login Attempts  
    Description            Failed Login Attempts
    Claim Uri              http://wso2.org/claims/identity/failedLoginAttempts  
    Mapped Attribute (s)   failedLoginAttempts  
    Supported by Default   true
  
    Display Name           UTC Offset  
    Description            UTC Offset
    Claim Uri              http://wso2.org/claims/utcOffset
    Mapped Attribute (s)   utcOffset
    Supported by Default   true
    [add values from user profile: eg. +05:30, -06:00]  
    
    Display Name           Day light saving time offset  
    Description            Day light saving time offset
    Claim Uri              http://wso2.org/claims/dstOffset
    Mapped Attribute (s)   dstOffset
    Supported by Default   true
    [add values from user profile: eg. +00:30, -01:15]
    ```
  
- Restart the AM and IS servers
- Run the follwing `mysql` queries to set the `http://wso2.org/claims/lastLoginTime` claim value for the existing users.It is manatory to set a innitial value for this attribute. (database `produmdb` - Change in script if the database name is different)

    ```sql
    use produmdb;
    DELETE from UM_USER_ATTRIBUTE where UM_ATTR_NAME = 'lastLoginTime';
    INSERT INTO UM_USER_ATTRIBUTE (UM_ATTR_NAME, UM_ATTR_VALUE, UM_PROFILE_ID, UM_USER_ID, UM_TENANT_ID) SELECT "lastLoginTime", (UNIX_TIMESTAMP() * 1000), "default", UM_USER.UM_ID, -1234 FROM UM_USER;
    ```
