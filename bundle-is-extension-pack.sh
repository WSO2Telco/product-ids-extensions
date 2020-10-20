#!/bin/bash
export TARGET_DIR=target
rm -rf ${TARGET_DIR}

export BASIC_AUTH_DIR=${TARGET_DIR}/basic-authenticator
mkdir -p ${BASIC_AUTH_DIR}
cp mbss-athenticator/features/com.wso2telco.dep.tokenregenerator.feature/target/dep-tokenregenerator-feature-*.zip ${BASIC_AUTH_DIR}
unzip ${BASIC_AUTH_DIR}/dep-tokenregenerator-feature-*.zip -d ${BASIC_AUTH_DIR}/unzip
mv ${BASIC_AUTH_DIR}/unzip/plugins/com.wso2telco.dep.tokenregenerator-*.jar ${BASIC_AUTH_DIR}
rm -rf ${BASIC_AUTH_DIR}/unzip
rm -f ${BASIC_AUTH_DIR}/dep-tokenregenerator-feature-*.zip
cp mbss-athenticator/components/com.wso2telco.dep.tokenregenerator/README.md ${BASIC_AUTH_DIR}

export MBSS_DIR=${TARGET_DIR}/mbss-athenticator
mkdir -p ${MBSS_DIR}/resources
cp mbss-athenticator/features/com.wso2telco.mbss.authenticator.feature/target/mbss-authenticator-feature-*.zip ${MBSS_DIR}
unzip ${MBSS_DIR}/mbss-authenticator-feature-*.zip -d ${MBSS_DIR}/unzip
mv ${MBSS_DIR}/unzip/plugins/com.wso2telco.mbss.authenticator-*.jar ${MBSS_DIR}/resources
rm -rf ${MBSS_DIR}/unzip
rm -f ${MBSS_DIR}/mbss-authenticator-feature-*.zip
cp mbss-athenticator/features/org.wso2.carbon.identity.data.publisher.session.feature/target/data-publisher-session-feature-*.zip ${MBSS_DIR}
unzip ${MBSS_DIR}/data-publisher-session-feature-*.zip -d ${MBSS_DIR}/unzip
mv ${MBSS_DIR}/unzip/plugins/org.wso2.carbon.identity.data.publisher.session-*.jar ${MBSS_DIR}/resources
rm -rf ${MBSS_DIR}/unzip
rm -f ${MBSS_DIR}/data-publisher-session-feature-*.zip
cp mbss-athenticator/components/org.wso2.carbon.identity.data.publisher.session/src/main/resources/db_setup.sql ${MBSS_DIR}
cp mbss-athenticator/components/com.wso2telco.mbss.authenticator/src/main/resources/mbss-authenticator-config.xml ${MBSS_DIR}
cp mbss-athenticator/components/com.wso2telco.mbss.authenticator/README.md ${MBSS_DIR}

export PASS_VAL_DIR=${TARGET_DIR}/password-validator
mkdir -p ${PASS_VAL_DIR}
cp mbss-athenticator/features/com.wso2telco.password.validator.feature/target/password-validator-feature-*.zip ${PASS_VAL_DIR}
unzip ${PASS_VAL_DIR}/password-validator-feature-*.zip -d ${PASS_VAL_DIR}/unzip
mv ${PASS_VAL_DIR}/unzip/plugins/com.wso2telco.password.validator-*.jar ${PASS_VAL_DIR}
rm -rf ${PASS_VAL_DIR}/unzip
rm -f ${PASS_VAL_DIR}/password-validator-feature-*.zip
cp mbss-athenticator/components/com.wso2telco.password.validator/README.md ${PASS_VAL_DIR}

export IDN_GOV_DIR=${TARGET_DIR}/identity-governance
mkdir -p ${IDN_GOV_DIR}
cp identity-governance/features/org.wso2.carbon.identity.account.suspension.notification.task.server.feature/target/account-suspension-notification-task-feature-*.zip ${IDN_GOV_DIR}
unzip ${IDN_GOV_DIR}/account-suspension-notification-task-feature-*.zip -d ${IDN_GOV_DIR}/unzip
mv ${IDN_GOV_DIR}/unzip/plugins/org.wso2.carbon.identity.account.suspension.notification.task-*.jar ${IDN_GOV_DIR}
rm -rf ${IDN_GOV_DIR}/unzip
rm -f ${IDN_GOV_DIR}/account-suspension-notification-task-feature-*.zip
cp identity-governance/components/org.wso2.carbon.identity.account.suspension.notification.task/src/main/resources/accountsuspension.properties ${IDN_GOV_DIR}
cp identity-governance/README.md ${IDN_GOV_DIR}
