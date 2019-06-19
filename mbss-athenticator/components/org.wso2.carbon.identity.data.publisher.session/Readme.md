# MBSS Feature - IGW 4.0.1
## Detect and terminate multiple sessions

## Configuration
Copy the `org.wso2.carbon.identity.data.publisher.session-1.0.0.jar` file to `<HUB_HOME>/repository/componenet/dropins/`

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

Start IS


## Notes

SSO should be enabled.


##### Apigate AXP 