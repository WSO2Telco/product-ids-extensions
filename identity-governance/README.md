# Account Suspension & Previous Login Time Features

### System Requirements

- Java SE Development Kit 1.8
- wso2telcohub-4.0.1-SNAPSHOT (WSO2 AM Server 2.5)
- wso2is-km-5.6.0

### Installation

1. Copy the `org.wso2.carbon.identity.account.suspension.notification.task-1.1.0.jar` 
into `<IS_HOME>/repository/components/dropins`

2. Copy the `accountsuspension.properties` file into the `<IS_HOME>/repository/conf/` and do 
the following configurations.
```
suspension.notification.account.disable.delay=90 (To set the time duration of the idle account)
suspension.notification.trigger.time=20:00:00 (Account suspension thread running time of the day)
```

3. Open `<IS_HOME>/repository/conf/user-mgt.xml` file and add the following configuration 
under `<UserStoreManager class="org.wso2.carbon.user.core.jdbc.JDBCUserStoreManager">` 
```
<Property name="NotificationReceiversRetrievalClass">org.wso2.carbon.identity.account.suspension.notification.task.jdbc.JDBCNotificationReceiversRetrieval</Property>
```

4. From Identity Server carbon console add (or modify if claim URI is already there) the below claims for 
claim dialect `http://wso2.org/claims`
```
Claim Uri               http://wso2.org/claims/prelastLoginTime
Display Name            Previous Last Login
Description             Previous Last Login Time
Mapped Attribute (s)    prelastLoginTime
Supported by Default    true

Claim Uri               http://wso2.org/claims/lastLoginTime
Display Name            Last Login
Description             Last Login Time
Mapped Attribute (s)    lastLoginTime
Supported by Default    true
(Check for similar display names with same Claim URI, Eg: lastlogin)

Claim Uri               http://wso2.org/claims/identity/accountSuspended
Display Name            Account Suspended
Description             Account Suspended
Mapped Attribute (s)    accountSuspended
Supported by Default	true

Claim Uri               http://wso2.org/claims/utcOffset
Display Name            UTC Offset
Description             UTC Offset
Mapped Attribute (s)    utcOffset
Supported by Default    true
[add values from user profile: eg. +05:30, -06:00]

Claim Uri               http://wso2.org/claims/dstOffset
Display Name            DST Offset
Description             Day Light Saving Time Offset
Mapped Attribute (s)    dstOffset
Supported by Default    true
[add values from user profile: eg. +00:30, -01:15]
```

5. Restart the AM and IS servers 

6. Run the following MySQL queries to set the `http://wso2.org/claims/lastLoginTime` claim value 
for the existing users. It is mandatory to set an initial value for this attribute. 
(database `produmdb` - Change in script if the database name is different)
```
use produmdb;
DELETE from UM_USER_ATTRIBUTE where UM_ATTR_NAME = 'lastLoginTime';
INSERT INTO UM_USER_ATTRIBUTE (UM_ATTR_NAME, UM_ATTR_VALUE, UM_PROFILE_ID, UM_USER_ID, UM_TENANT_ID) SELECT "lastLoginTime", (UNIX_TIMESTAMP() * 1000), "default", UM_USER.UM_ID, -1234 FROM UM_USER;
```
