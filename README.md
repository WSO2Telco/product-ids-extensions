# Identity Server Extensions
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