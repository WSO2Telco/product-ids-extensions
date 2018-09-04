README
================================

Intro
---------
This describes the steps to configure and run the Password Recovery web application with Identity Server. 

Prerequisites
--------------

Build Identity Server 5.2.0
Tomcat 6 - To deploy the webapp


Configuration
--------------

1. configure the web.xml with the following.

Specify the "carbonServerUrl" with the URL of the Identity Server. eg. https://localhost:9443
Specify the "storeLoginURL" with the URL of the AM Server login page. eg. https://localhost:9443/store/site/pages/login.jag
Specify the credentials to access Identity Server with admin privileges for "accessUsername" and "accessPassword".
Specify the captcha validation enable or disable in the webApp using captchaDisable propery.
Specify the trustStore absolute resource path for "trustStorePath". eg. path to wso2carbon.jks of the Identity Server

2. If you are deploying the app in tomcat enable the SSL configuration in {tomcat_home}/conf/server.xml
(please change <IS_HOME> from correct value)

    <Connector port="8443" protocol="HTTP/1.1" SSLEnabled="true"
               maxThreads="150" scheme="https" secure="true"
               clientAuth="false" sslProtocol="TLS"
               keystoreFile="<IS_HOME>/repository/resources/security/wso2carbon.jks" keystorePass="wso2carbon" />

3. Configure the email confirmation links.

To configure for password reset call back in Identity Server (in <IS_HOME>/repository/conf/email/email-admin-config.xml with email type as type="passwordReset")
according to the sample as follows. This will be the confirmation handler path of the user's confirmation.

Eg:

-----------------------------------------------------------------------------------------------------------------------------------
<configuration type="passwordReset">
  <targetEpr>https://localhost:9443/InfoRecovery/infoRecover/verify</targetEpr>
  <subject>WSO2 Carbon - Password Reset</subject>
  <body>
Hi {first-name}

We received a request to change the password on the {user-name} account associated with this e-mail address. If you made this request, please click the link below to securely change your password:

https://localhost:9443/InfoRecovery/infoRecover/verify?confirmation={confirmation-code}&amp;userstoredomain={userstore-domain}&amp;username={url:user-name}&amp;tenantdomain={tenant-domain}

If clicking the link doesn't seem to work, you can copy and paste the link into your browser's address window.

If you did not request to have your {user-name} password reset, simply disregard this email and no changes to your account will be made.
  </body>
  <footer>
Best Regards,
WSO2 Carbon Team
http://www.wso2.com
  </footer>
  <redirectPath></redirectPath>
</configuration>

-----------------------------------------------------------------------------------------------------------------------------------

Please refer the Identity Server documentation for sample email template in https://docs.wso2.com/display/IS500/Recover+with+Notification

To configure for account confirmation in Self sign up provide the configuration in email-admin-config.xml
with email type as "accountConfirmation". Following is the call back handler for the sample.
<targetEpr>https://localhost:9443/InfoRecovery/confirmReg</targetEpr>

4. Configure the identity.xml file attributes as follows in the Identity Server(in repository/conf/identity/).

<EventListener type="org.wso2.carbon.user.core.listener.UserOperationEventListener"
                       name="org.wso2.carbon.identity.workflow.mgt.impl.userstore.UserStoreActionListener"
                       orderId="10" enable="true"/>

5. Configure the identity-mgt.properties file attributes as follows in the Identity Server(in repository/conf/identity/).

Notification.Sending.Enable=true
Notification.Expire.Time=7200
Notification.Sending.Internally.Managed=true
UserAccount.Recovery.Enable=true
Captcha.Verification.Internally.Managed=true

6. repository/conf/axis2/axis2.xml configuration for email sending.
    <transportSender name="mailto" class="org.apache.axis2.transport.mail.MailTransportSender"">
        <parameter name="mail.smtp.from">test@gmail.com</parameter>
        <parameter name="mail.smtp.user">test@gmail.com</parameter>
        <parameter name="mail.smtp.password">testpass</parameter>
        <parameter name="mail.smtp.host">smtp.gmail.com</parameter>
        <parameter name="mail.smtp.port">587</parameter>
        <parameter name="mail.smtp.starttls.enable">true</parameter>
        <parameter name="mail.smtp.auth">true</parameter>
    </transportSender>

7. Add below claim to IS Carbon
Dialect: http://wso2.org/claims
Display Name: Identity Password timestamp
Description: Identity Password timestamp
Claim Uri: http://wso2.org/claims/identity/passwordTimestamp
Mapped Attribute: facsimileTelephoneNumber

8. After deploying the webapp in <CARBON_HOME>/repository/deployment/server/webapps/ create file InfoRecovery/META-INF/context.xml and add below content.
<Context>
<Loader delegate="true" />
</Context>


To run the app you may directly copy the InfoRecovery.war in the target.

How to run by deploying the existing war file
----------------------------------------------

1. Copy the InfoRecovery.war in the target folder to tomcat's webapp folder.
2. Start and stop the tomcat server
3. Configure tomcat as instructed above "Configuration" step.
4. Start tomcat.
5. Access the sample with URL - https://localhost:9443/InfoRecovery


How to build using maven
------------------------

Before building make sure following dependancies are satisfied.

org.wso2.carbon.identity.mgt.stub
org.wso2.carbon.utils
org.wso2.carbon.um.ws.api.stub
org.wso2.carbon.identity.user.registration.stub
org.apache.axis2.wso2
org.apache.ws.commons.axiom.wso2

Follow the instructions in the Configuration step above.

Build the war with maven using mvn install
Copy the war file to tomcat webapps




