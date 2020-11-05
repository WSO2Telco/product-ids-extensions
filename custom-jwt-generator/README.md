# Custom JWT Generator

### System Requirements

- Java SE Development Kit 1.8
- wso2telcohub-4.0.1-SNAPSHOT (WSO2 AM Server 2.5)
- wso2is-km-5.6.0

### Features

This enables the custom JWT generator feature originally developed for Amdocs IGW release.

### Installation

1. Copy the `custom-jwt-generator-1.1.1.jar` into `<IS_HOME>/repository/components/lib` directory.

2. Then enable the custom JWT generation by modifying following properties in `api-manager.xml`. This JWT format is 
customized based on Amdocs requirements.
```
<JWTConfiguration>
   <EnableJWTGeneration>true</EnableJWTGeneration>
   <JWTGeneratorImpl>com.wso2telco.dep.custom.jwt.CustomJWTTokenGenerator</JWTGeneratorImpl>
</JWTConfiguration>
```

3. This customization has enabled feature to use ES384 signing algorithms via the configuration at `api-manager.xml`. 
But Amdocs is using default implementation which is SHA256withRSA, hence the following is **not required**
```
<JWTConfiguration>
   <SignatureAlgorithm>ES384</SignatureAlgorithm>
</JWTConfiguration>
```

5. If custom keystore is required to be used for signing, it should be added to the registry and registry flag need 
to be created. But in Amdocs use-case default is used, hence the following is **not required**.  

Registry flag should be as following path and value  
path : `/_system/governance/apimgt/ssl.with.custom.keystore`  
value: `true`  

The keystore needs to be added, with properties mentioned for the resource.  
path: `/_system/governance/repository/security/key-stores/mutualSSL.jks`  

properties   
type: `jks`  
resource.source: `AdminConsole`  
password needs to be generated via `CryptoUtil.getDefaultCryptoUtil().encryptAndBase64Encode("wso2carbon".getBytes())`
