# Custom JWT Generator

### System Requirements

- Java SE Development Kit 1.8
- wso2telcohub-4.0.1-SNAPSHOT (WSO2 AM Server 2.5)
- wso2is-km-5.6.0

### Features

This enables the custom JWT generator feature originally developed for Amdocs IGW release.

### Installation

1. Copy the `custom-jwt-generator-1.1.0-SNAPSHOT.jar` into `<IS_HOME>/repository/components/lib`

2. The custom JWT needs to be enabled by following at `api-manager.xml`.
```
<JWTConfiguration>
   <JWTGeneratorImpl>com.wso2telco.dep.custom.jwt.CustomJWTTokenGenerator</JWTGeneratorImpl>
</JWTConfiguration>
```

3. This is jwt format customized based on the amdocs requirements

4. This customization have enabled feature to use ES384 signing algorithms via the configuration at api-manager.xml. By default it will be using SHA256withRSA.But amdocs are using default implementation.
```
<JWTConfiguration>
   <SignatureAlgorithm>ES384</SignatureAlgorithm>
</JWTConfiguration>
```

5. If custom keystore is required to be used for sigining it need to be added to the registry and registry flag need to be created. In amdocs usecase default is used so following is not required.  

Registry flag should be as following path and value  
path : `/_system/governance/apimgt/ssl.with.custom.keystore`  
value: `true`  

And the keystore needs to be added, with properties mentioned for the resource.  
path: `/_system/governance/repository/security/key-stores/mutualSSL.jks`  

properties   
type: `jks`  
resource.source: `AdminConsole`  
password needs to be generated via `CryptoUtil.getDefaultCryptoUtil().encryptAndBase64Encode("wso2carbon".getBytes())`
