# Token Regenerator

### System Requirements

- Java SE Development Kit 1.8
- wso2telcohub-4.0.1-SNAPSHOT (WSO2 AM Server 2.5)
- wso2is-km-5.6.0

### Features

This enables the feature of authenticating api calls using Basic authentication. 
The `tokenregenerator` component is used to regenerate the token when the user reset the password. 

### Installation

1. Copy `com.wso2telco.dep.tokenregenerator-x.x.x.jar` to `<IS_HOME>/repository/components/dropins/`

2. To enable Basic Auth in a SELECTED API, edit the API synapse file located in 
`<DEP_HOME>/repository/deployment/server/synapse-configs/default/api` and add 
below `handler` at the top of `handlers`
```
<handler class="com.wso2telco.dep.apihandler.ApiInvocationHandler"/> 
```
Note that this will get reverted once API republished.

3. To enable basic auth for all APIs, open `<DEP_HOME>/repository/resources/api_templates/velocity_template.xml` 
file and add `ApiInvocationHandler` below the line `<handlers xmlns="http://ws.apache.org/ns/synapse">` 
as following
```
#if($handlers.size() > 0)
<handlers xmlns="http://ws.apache.org/ns/synapse">
<handler class="com.wso2telco.dep.apihandler.ApiInvocationHandler"/>	
#foreach($handler in $handlers)
```

4. Add the below lines to `auth_failure_handler_.xml` in 
`<DEP>/repository/deployment/server/synapse-configs/default/sequences`
```
<property expression="$ctx:app_consumer_key" name="app_consumer_key"/>
<filter regex="900901" source="get-property('ERROR_CODE')">
    <class name="com.wso2telco.dep.apihandler.CacheUpdateMediator"/>
</filter>
```

Note: SP can only have one application with Basic auth.
