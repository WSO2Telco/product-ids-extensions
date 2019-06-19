# Token Regenerator- IGW 4.0.1

Copy the `api-invocation-handler-<version>.jar` file to `<HUB_HOME>/repository/componenet/dropins/`
** Build api-invocation-handler-<version>.jar from repository `extended-handlers`

Place the `mig_aouth_token.properties` file in /repository/conf/ location.

Edit the API synapse to add below handler at the top of handlers [on our auth token userinfo apis]
`<handler class="com.wso2telco.dep.apihandler.ApiInvocationHandler"/>`
For token, userinfo API synapse add the below snippet additionaly before `<send>`tag of `<inSequence>`


#### Using for Basic Auth GW

Copy the api-invocation-handler-1.0.0.jar file to `<HUB_HOME>/repository/componenet/dropins/`

Edit the API synapse to add below handler at the top of handlers 

### Example Syanpse file conating the API Invocation Handler

```
   <handlers>
      <handler class="com.wso2telco.dep.apihandler.ApiInvocationHandler"/>
      <handler class="org.wso2.carbon.apimgt.gateway.handlers.common.APIMgtLatencyStatsHandler"/>
      <handler class="org.wso2.carbon.apimgt.gateway.handlers.security.CORSRequestHandler">
         <property name="apiImplementationType" value="ENDPOINT"/>
      </handler>
      <handler class="org.wso2.carbon.apimgt.gateway.handlers.security.APIAuthenticationHandler"/>
      <handler class="org.wso2.carbon.apimgt.gateway.handlers.throttling.APIThrottleHandler">
         <property name="policyKey" value="gov:/apimgt/applicationdata/tiers.xml"/>
         <property name="policyKeyApplication"
                   value="gov:/apimgt/applicationdata/app-tiers.xml"/>
         <property name="id" value="A"/>
         <property name="policyKeyResource"
                   value="gov:/apimgt/applicationdata/res-tiers.xml"/>
      </handler>
      <handler class="org.wso2.carbon.apimgt.usage.publisher.APIMgtUsageHandler"/>
      <handler class="org.wso2.carbon.apimgt.usage.publisher.APIMgtGoogleAnalyticsTrackingHandler">
         <property name="configKey" value="gov:/apimgt/statistics/ga-config.xml"/>
      </handler>
      <handler class="org.wso2.carbon.apimgt.gateway.handlers.ext.APIManagerExtensionHandler"/>
      <handler class="com.wso2telco.dep.validator.handler.APIInfoHandler"/>
   </handlers>
```

### Adding tokenregenerator-xxx.jar

Copy com.wso2telco.dep.tokenregenerator-1.0.0.jar to `<IS_HOME>/repository/components/dropins/`

### Update the _auth_failure_handler_.xml

Add the below lines to `_auth_failure_handler_.xml` in `repository/deployment/server/synapse-configs/default/sequences`
  
Add these line below the <property name="error_message_type" value="application/xml"/>

```
    <property expression="$ctx:app_consumer_key" name="app_consumer_key"/>
    <filter regex="900901" source="get-property('ERROR_CODE')">
        <class name="com.wso2telco.dep.apihandler.CacheUpdateMediator"/>
    </filter>
```

### Notes
* SP can only have one application been used at a time with Basic auth.

##### Apigate AXP 