# Custom JWT Generator

### System Requirements

- Java SE Development Kit 1.8
- wso2telcohub-4.0.1-SNAPSHOT (WSO2 AM Server 2.5)
- wso2is-km-5.6.0

### Features

This enables the normal url JWT generator feature originally developed for Dialog IGW release.

### Installation

1. Copy the `jwt-generator-without-escaped-url-1.1.2.jar` into `<IS_HOME>/repository/components/lib`

2. The custom JWT needs to be enabled by following at `api-manager.xml`.
```
<JWTConfiguration>
   <JWTGeneratorImpl>com.wso2telco.dep.custom.jwt.JWTGeneratorWithoutEscapedURL</JWTGeneratorImpl>
</JWTConfiguration>
```

