# Password Validator

### System Requirements

- Java SE Development Kit 1.8
- wso2telcohub-4.0.1-SNAPSHOT (WSO2 AM Server 2.5)
- wso2is-km-5.6.0

### Features

This avoids user entering username as part of the password field during signup process

### Installation

1. Copy following artifact from `resources/` directory into `<IS_HOME>/repository/components/dropins` 
(replace existing ones if needed)
```
password-validator-1.1.0.jar
```

2. Open the `identity-event.properties` file found in the `<IS_HOME>/repository/conf/identity/` directory 
and locate the config `passwordPolicy.class.PasswordNamePolicy` and replace the value with following.
```
passwordPolicy.class.PasswordNamePolicy=com.wso2telco.password.validator.CustomPasswordPolicy
```

3. Set the value of `passwordPolicy.enable` to `true`
```
passwordPolicy.enable=true
```

4. Restart the IS server
