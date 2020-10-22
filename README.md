# Identity Server Extensions
[![Build](https://github.com/WSO2Telco/product-ids-extensions/workflows/build/badge.svg)](https://github.com/chathurabuddi/product-ids-extensions/actions?query=workflow%3Abuild)
[![Latest Version](https://img.shields.io/github/v/release/WSO2Telco/product-ids-extensions)](https://github.com/WSO2Telco/product-ids-extensions/releases/latest)

Additional features developed for WSO2 Identity Server 5.6.0.

### MBSS Authenticator
The authenticator will enable limiting number of allowed concurrent sessions for a user feature and 
configuring work hours for users and restrict login times to working hours feature.  
Please refer [MBSS Authenticator README](mbss-athenticator/components/com.wso2telco.mbss.authenticator/README.md)

### Token Regenerator
This enables the feature of authenticating api calls using Basic authentication. The `tokenregenerator` component 
is used to regenerate the token when the user reset the password.  
Please refer [Token Regenerator README](mbss-athenticator/components/com.wso2telco.dep.tokenregenerator/README.md)

### Password Validator
This avoids user entering username as part of the password field during signup process  
Please refer [Password Validator README](mbss-athenticator/components/com.wso2telco.password.validator/README.md)

### Identity Governance
This enables the account suspension & previous login time features.  
Please refer [Identity Governance README](identity-governance/README.md)

### SSO Enhancement
Remove SSO login page forgot username,password and register now links.  
Please refer [SSO Enhancement](sso-enhancement/README.md)