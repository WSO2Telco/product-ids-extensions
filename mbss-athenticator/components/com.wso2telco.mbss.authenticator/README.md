# MBSS Authenticator

### System Requirements

- Java SE Development Kit 1.8
- wso2telcohub-4.0.1-SNAPSHOT (WSO2 AM Server 2.5)
- wso2is-km-5.6.0

### Features

The authenticator will enable following features on IS 5.6.0 
1. Limit number of allowed concurrent sessions for a user 
2. Configure work hours for users and restrict login times to working hours.  

### Installation

1. Copy following artifacts into <IS_HOME>/repository/components/dropins 
```
com.wso2telco.mbss.authenticator-1.1.0.jar
org.wso2.carbon.identity.data.publisher.session-1.1.0.jar 
```

2. Copy mbss-authenticator-config.xml file into <IS_HOME>/repository/conf directory 

3. Set following configurations to false on <IS_HOME>/repository/conf/mbss-authenticator-config.xml  
```
accountSuspensionFeature 
periodicPasswordChangeFeature 
changePasswordAtFirstLogin 
```

4. Define the following new datasource in IS 
```
<datasource>
    <name>IDENTITY_DB</name>
    <description>The datasource used for message broker database</description>
    <jndiConfig>
	<name>jdbc/WSO2IDENTITY_DB</name>
    </jndiConfig>
    <definition type="RDBMS">
	<configuration>
	    <url>jdbc:mysql://<DB_HOST>:<PORT>/identitydb?autoReconnect=true&amp;relaxAutoCommit=true&amp;</url>
	     <username>XXXX</username>
	    <password>XXXX</password>
	    <driverClassName>com.mysql.jdbc.Driver</driverClassName>
	    <maxActive>50</maxActive>
	    <maxWait>60000</maxWait>
	    <testOnBorrow>true</testOnBorrow>
	    <validationQuery>SELECT 1</validationQuery>
	    <validationInterval>30000</validationInterval>
	</configuration>
    </definition>
</datasource> 
```

5. Execute db_setup.mysql.sql on the database defined in the previous step (WSO2IDENTITY_DB) 

6. Open identity.xml file located at <IS_HOME>/repository/conf/identity directory and find the <EventListeners> section and insert the following snippet at the end of the section. 
```
<EventListener type="org.wso2.carbon.identity.core.handler.AbstractIdentityMessageHandler" 
              name="org.wso2.carbon.identity.data.publisher.session.impl.DbSessionDataPublisherImpl" 
              orderId="11" enable="true" /> 
```

7. Start IS

8. Create following claims on IS 
```
Dialect:                      http://wso2.org/claims 
Claim Uri:                    http://wso2.org/claims/utcOffset 
Display Name:                 UTC Offset 
Description:                  UTC Offset 
Mapped Attribute (s):         utcOffset 
Supported by Default:         true 

Dialect:                      http://wso2.org/claims 
Claim Uri:                    http://wso2.org/claims/dstOffset 
Display Name:                 Day light saving time offset 
Description:                  Day light saving time offset 
Mapped Attribute (s):         dstOffset 
Supported by Default:         true 
```

9. Set MBSSBasicAuthenticator from Service Provider Configuration

Note: SSO should be enabled.
 