package org.wso2.carbon.identity.data.publisher.session;

import org.wso2.carbon.identity.application.authentication.framework.AuthenticationDataPublisher;
import org.wso2.carbon.identity.application.authentication.framework.context.AuthenticationContext;
import org.wso2.carbon.identity.application.authentication.framework.context.SessionContext;
import org.wso2.carbon.identity.application.authentication.framework.util.FrameworkConstants;
import org.wso2.carbon.identity.core.handler.AbstractIdentityMessageHandler;
import org.wso2.carbon.identity.data.publisher.session.internal.AuthenticationDataPublisherDataHolder;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public class AuthnDataPublisherProxy extends AbstractIdentityMessageHandler implements
        AuthenticationDataPublisher {

    private List<AuthenticationDataPublisher> dataPublishers = AuthenticationDataPublisherDataHolder.getInstance()
            .getDataPublishers();

    /**
     * Publish authentication success after managing handler operations
     *
     * @param request Request which comes to the framework for authentication
     * @param context Authentication context
     * @param params  Other parameters which are need to be passed
     */
    public void publishAuthenticationStepSuccess(HttpServletRequest request, AuthenticationContext context,
                                                 Map<String, Object> params) {
        for (AuthenticationDataPublisher publisher : dataPublishers) {
            if (publisher.isEnabled(context) && publisher.canHandle(context)) {
                publisher.publishAuthenticationStepSuccess(request, context, params);
            }
        }
    }

    /**
     * Published authentication step failure after managing handler operations
     *
     * @param request         Incoming Http request to framework for authentication
     * @param context         Authentication Context
     * @param unmodifiableMap Other relevant parameters which needs to be published
     */
    public void publishAuthenticationStepFailure(HttpServletRequest request, AuthenticationContext context,
                                                 Map<String, Object> unmodifiableMap) {
        for (AuthenticationDataPublisher publisher : dataPublishers) {
            if (publisher.isEnabled(context) && publisher.canHandle(context)) {
                publisher.publishAuthenticationStepFailure(request, context, unmodifiableMap);
            }
        }

    }

    /**
     * Publishes authentication success after managing handler operations
     *
     * @param request         Incoming request for authentication
     * @param context         Authentication context
     * @param unmodifiableMap Other relevant parameters which needs to be published
     */
    public void publishAuthenticationSuccess(HttpServletRequest request, AuthenticationContext context,
                                             Map<String, Object> unmodifiableMap) {
        for (AuthenticationDataPublisher publisher : dataPublishers) {
            if (publisher != null && publisher.isEnabled(context) && publisher.canHandle(context)) {
                publisher.publishAuthenticationSuccess(request, context, unmodifiableMap);
            }
        }

    }

    /**
     * Publishes authentication failure after managing handler operations
     *
     * @param request         Incoming authentication request
     * @param context         Authentication context
     * @param unmodifiableMap Other relevant parameters which needs to be published
     */
    public void publishAuthenticationFailure(HttpServletRequest request, AuthenticationContext context,
                                             Map<String, Object> unmodifiableMap) {
        for (AuthenticationDataPublisher publisher : dataPublishers) {
            if (publisher != null && publisher.isEnabled(context) && publisher.canHandle(context)) {
                publisher.publishAuthenticationFailure(request, context, unmodifiableMap);
            }
        }
    }

    /**
     * Publishes session creation information after managing handler operations
     *
     * @param request         Incoming request for authentication
     * @param context         Authentication Context
     * @param sessionContext  Session context
     * @param unmodifiableMap Other relevant parameters which needs to be published
     */
    public void publishSessionCreation(HttpServletRequest request, AuthenticationContext context, SessionContext
            sessionContext, Map<String, Object> unmodifiableMap) {
        for (AuthenticationDataPublisher publisher : dataPublishers) {
            if (publisher != null && publisher.isEnabled(context) && publisher.canHandle(context)) {
                publisher.publishSessionCreation(request, context, sessionContext, unmodifiableMap);
            }
        }
    }

    /**
     * Publishes session update after managing handler operations
     *
     * @param request         Incoming request for authentication
     * @param context         Authentication context
     * @param sessionContext  Session context
     * @param unmodifiableMap Other relevant parameters which needs to be published
     */

    public void publishSessionUpdate(HttpServletRequest request, AuthenticationContext context, SessionContext
            sessionContext, Map<String, Object> unmodifiableMap) {
        for (AuthenticationDataPublisher publisher : dataPublishers) {
            if (publisher != null && publisher.isEnabled(context) && publisher.canHandle(context)) {
                publisher.publishSessionUpdate(request, context, sessionContext, unmodifiableMap);
            }
        }

    }

    /**
     * Publishes session termination
     *
     * @param request         Incoming request for authentication
     * @param context         Authentication context
     * @param sessionContext  Session context
     * @param unmodifiableMap Other relevant parameters which needs to be published
     */

    public void publishSessionTermination(HttpServletRequest request, AuthenticationContext context,
                                          SessionContext sessionContext, Map<String, Object> unmodifiableMap) {
        for (AuthenticationDataPublisher publisher : dataPublishers) {
            if (publisher != null && publisher.isEnabled(context) && publisher.canHandle(context)) {
                publisher.publishSessionTermination(request, context, sessionContext, unmodifiableMap);
            }
        }
    }

    @Override
    public String getName() {
        return FrameworkConstants.AnalyticsAttributes.AUTHN_DATA_PUBLISHER_PROXY;
    }
}
