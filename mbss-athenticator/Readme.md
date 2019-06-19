## CONFIGURING MBSS AUTHENTICATOR ON INTGW 4.0.1

### Install

Stop IS

Copy following artifacts from resources/ directory into <IS_HOME>/repository/components/dropin
   
   a. `com.wso2telco.mbss.authenticator-1.0.0.jar`
   
   b. `org.wso2.carbon.identity.data.publisher.session-1.0.0.jar`
   
   c. `com.wso2telco.password.validator-1.0.0.jar`
   
Copy com.wso2telco.mbss.authenticator/resources/`mbss-authenticator-config.xml` file into `<IS_HOME>/repository/conf` directory.

Copy com.wso2telco.mbss.authenticator/resources/`pwd-reset.jsp` into `<IS_HOME>/repository/deployment/server/webapps/authenticationendpoint/` directory.

Set following configurations to false on `<IS_HOME>/repository/conf/mbss-authenticator-config.xml`

a. `accountSuspensionFeature`

b. `periodicPasswordChangeFeature`

c. `changePasswordAtFirstLogin`
   
Define the following datasource in IS
```
<datasource>
    <name>IDENTITY_DB</name>
    <description> ... </description> 
    <jndiConfig> 
        <name>jdbc/WSO2IDENTITY_DB</name> 
        </jndiConfig> …. </datasource>
        ...
 </datasource>       
```

Execute `resources/db_setup.mysql.sql` on the database defined in the previous step (WSO2IDENTITY_DB)

Open `identity.xml` file located at `<IS_HOME>/repository/conf/identity` directory and find the `<EventListeners>` section and insert the following snippet at the end of the section.

````
<EventListener type="org.wso2.carbon.identity.core.handler.AbstractIdentityMessageHandler" name="org.wso2.carbon.identity.data.publisher.session.impl.DbSessionDataPublisherImpl" orderId="11" enable="true" />
````

Create following claims on IS
````
Dialect:        http://wso2.org/claims 
Display Name:   UTC Offset 
Description:    UTC Offset 
Claim Uri:      http://wso2.org/claims/utcOffset 
Mapped Attribute (s): utcOffset 
Supported by Default: true
````
````
Dialect:        http://wso2.org/claims 
Display Name:   Day light saving time offset 
Description:    Day light saving time offset 
Claim Uri:      http://wso2.org/claims/dstOffset 
Mapped Attribute (s): dstOffset 
Supported by Default: true
````
````
Dialect:                http://wso2.org/claims
Display Name:	        Intitial Password Changed
Description:        	Intitial Password Changed
Claim Uri:          	http://wso2.org/claims/identity/initialPasswordChanged
Mapped Attribute (s):	initialPasswordChanged
Supported by Default:	false
````
        
    
Create the roles defined in `mbss-authenticator-config.xml` (inside workingTime sections) on IS using management console or remove unecessary definitions from configuration file.

Assign newly created roles to users as needed.

Start IS

Log in to `https://localhost:9444/carbon/admin/login.jsp` using `admin`

Set `MBSSBasicAuthenticator` from `Service Provider Configuration`

## Notes

SSO should be enabled.


##### Apigate AXP 

