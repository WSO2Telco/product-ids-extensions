## CONFIGURING MBSS AUTHENTICATOR ON INTGW 4.0.1

### Install

1. Download the Patch: https://s3.amazonaws.com/sftp-release-binaries/sftp/MIG/patches/
2. Stop IS
3. Copy following artifacts from resources/ directory into <IS_HOME>/repository/components/dropin
   
   a. com.wso2telco.mbss.authenticator-1.0.0.jar
   
   b. org.wso2.carbon.identity.data.publisher.session-1.0.0.jar
   
   c. password-validator-1.0-SNAPSHOT.jar
   
4. Copy resources/mbss-authenticator-config.xml file into <IS_HOME>/repository/conf directory
5. Set following configurations to false on <IS_HOME>/repository/conf/mbss-authenticator-config.xml
    
    a. accountSuspensionFeature
    
    b. periodicPasswordChangeFeature
    
    c. changePasswordAtFirstLogin
    
6. Define the following datasource in IS/
````
<datasource>
    <name>IDENTITY_DB</name> 
    <description></description> 
    <jndiConfig> 
        <name>jdbc/WSO2IDENTITY_DB</name> 
    </jndiConfig>
    ......
</datasource>
````
