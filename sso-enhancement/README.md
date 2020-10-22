# Remove Forgot Username,Password and Register Now Links In SSO Login Page 

### System Requirements

- Java SE Development Kit 1.8
- wso2telcohub-4.0.1-SNAPSHOT (WSO2 AM Server 2.5)
- wso2is-km-5.6.0

### Features

1. Remove forgot username and password recovery option sso login page.
2. Remove register now self signup sso login page. 

### Installation

1. Copy and replace `basicauth.jsp` to `<IS_HOME>/repository/deployment/server/webapps/authenticationendpoint/basicauth.jsp`

2. Check correctly code comments are available 182 to 246 lines in basicauth.jsp file


Note : Can update basicauth.jsp file copy and replace OR comment following code 182 to 246 lines in basicauth.jsp

        <%
            String recoveryEPAvailable = application.getInitParameter("EnableRecoveryEndpoint");
            String enableSelfSignUpEndpoint = application.getInitParameter("EnableSelfSignUpEndpoint");

            Boolean isRecoveryEPAvailable;
            Boolean isSelfSignUpEPAvailable;

            if (StringUtils.isNotBlank(recoveryEPAvailable)) {
                isRecoveryEPAvailable = Boolean.valueOf(recoveryEPAvailable);
            } else {
                isRecoveryEPAvailable = isRecoveryEPAvailable();
            }

            if (StringUtils.isNotBlank(enableSelfSignUpEndpoint)) {
                isSelfSignUpEPAvailable = Boolean.valueOf(enableSelfSignUpEndpoint);
            } else {
                isSelfSignUpEPAvailable = isSelfSignUpEPAvailable();
            }

            if (isRecoveryEPAvailable || isSelfSignUpEPAvailable) {
                String scheme = request.getScheme();
                String serverName = request.getServerName();
                int serverPort = request.getServerPort();
                String uri = (String) request.getAttribute(JAVAX_SERVLET_FORWARD_REQUEST_URI);
                String prmstr = (String) request.getAttribute(JAVAX_SERVLET_FORWARD_QUERY_STRING);
                String urlWithoutEncoding = scheme + "://" +serverName + ":" + serverPort + uri + "?" + prmstr;
                String urlEncodedURL = URLEncoder.encode(urlWithoutEncoding, UTF_8);

                String identityMgtEndpointContext =
                        application.getInitParameter("IdentityManagementEndpointContextURL");
                if (StringUtils.isBlank(identityMgtEndpointContext)) {
                    identityMgtEndpointContext = getServerURL("/accountrecoveryendpoint", true, true);
                }

                if (isRecoveryEPAvailable) {
        %>
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 form-group">
            <div class="form-actions">
                <%=AuthenticationEndpointUtil.i18n(resourceBundle, "forgot.username.password")%>
                <a id="usernameRecoverLink" href="<%=getRecoverUsernameUrl(identityMgtEndpointContext, urlEncodedURL)%>">
                    <%=AuthenticationEndpointUtil.i18n(resourceBundle, "forgot.username")%>
                </a>
                <%=AuthenticationEndpointUtil.i18n(resourceBundle, "forgot.username.password.or")%>
                <a id="passwordRecoverLink" href="<%=getRecoverPasswordUrl(identityMgtEndpointContext, urlEncodedURL)%>">
                    <%=AuthenticationEndpointUtil.i18n(resourceBundle, "forgot.password")%>
                </a>
                ?
            </div>
        </div>
        <%
                }
                if (isSelfSignUpEPAvailable) {
        %>
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 form-group">
            <div class="form-actions">
            <%=AuthenticationEndpointUtil.i18n(resourceBundle, "no.account")%>
            <a id="registerLink" href="<%=getRegistrationUrl(identityMgtEndpointContext, urlEncodedURL)%>">
                <%=AuthenticationEndpointUtil.i18n(resourceBundle, "register.now")%>
            </a>
            </div>
        </div>
        <%
                }
            }
        %>

