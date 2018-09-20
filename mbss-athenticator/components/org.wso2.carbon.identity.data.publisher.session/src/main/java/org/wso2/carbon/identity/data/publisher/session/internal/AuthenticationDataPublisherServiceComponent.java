package org.wso2.carbon.identity.data.publisher.session.internal;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.event.stream.core.EventStreamService;
import org.wso2.carbon.identity.application.authentication.framework.AuthenticationDataPublisher;
import org.wso2.carbon.identity.application.authentication.framework.util.FrameworkConstants;
import org.wso2.carbon.identity.core.handler.MessageHandlerComparator;
import org.wso2.carbon.identity.data.publisher.session.AuthnDataPublisherProxy;
import org.wso2.carbon.identity.data.publisher.session.impl.AuthenticationAuditLogger;
import org.wso2.carbon.identity.data.publisher.session.impl.DbLoginDataPublisherImpl;
import org.wso2.carbon.identity.data.publisher.session.impl.DbSessionDataPublisherImpl;
import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.user.core.service.RealmService;

import java.util.Collections;

/**
 * @scr.component name="org.wso2.carbon.identity.data.publisher.authn" immediate="true"
 * @scr.reference name="registry.service"
 * interface="org.wso2.carbon.registry.core.service.RegistryService"
 * cardinality="1..1" policy="dynamic" bind="setRegistryService"
 * unbind="unsetRegistryService"
 * @scr.reference name="realm.service" interface="org.wso2.carbon.user.core.service.RealmService"
 * cardinality="1..1" policy="dynamic" bind="setRealmService"
 * unbind="unsetRealmService"
 * @scr.reference name="eventStreamManager.service"
 * interface="org.wso2.carbon.event.stream.core.EventStreamService" cardinality="1..1"
 * policy="dynamic" bind="setEventStreamService" unbind="unsetEventStreamService"
 * unbind="unsetEventStreamService"
 * @scr.reference name="identity.authentication.data.publisher"
 * interface="org.wso2.carbon.identity.application.authentication.framework.AuthenticationDataPublisher"
 * cardinality="0..n" policy="dynamic" bind="setAuthenticationDataPublisher"
 * unbind="unsetAuthenticationDataPublisher"
 */
public class AuthenticationDataPublisherServiceComponent {

    protected void activate(ComponentContext context) {

        BundleContext bundleContext = context.getBundleContext();
        bundleContext
                .registerService(AuthenticationDataPublisher.class.getName(), new DbLoginDataPublisherImpl(), null);
        bundleContext
                .registerService(AuthenticationDataPublisher.class.getName(), new DbSessionDataPublisherImpl(), null);
        bundleContext
                .registerService(AuthenticationDataPublisher.class.getName(), new AuthenticationAuditLogger(), null);
        bundleContext
                .registerService(AuthenticationDataPublisher.class.getName(), new AuthnDataPublisherProxy(), null);

    }

    protected void setEventStreamService(EventStreamService publisherService) {

        AuthenticationDataPublisherDataHolder.getInstance().setPublisherService(publisherService);
    }

    protected void unsetEventStreamService(EventStreamService publisherService) {

        AuthenticationDataPublisherDataHolder.getInstance().setPublisherService(null);
    }

    protected void setRealmService(RealmService realmService) {

        AuthenticationDataPublisherDataHolder.getInstance().setRealmService(realmService);
    }

    protected void unsetRealmService(RealmService realmService) {

        AuthenticationDataPublisherDataHolder.getInstance().setRealmService(null);
    }

    protected void setRegistryService(RegistryService registryService) {

        AuthenticationDataPublisherDataHolder.getInstance().setRegistryService(registryService);
    }

    protected void unsetRegistryService(RegistryService registryService) {

        AuthenticationDataPublisherDataHolder.getInstance().setRegistryService(null);
    }

    protected void setAuthenticationDataPublisher(AuthenticationDataPublisher publisher) {
        if (publisher != null && !FrameworkConstants.AnalyticsAttributes.AUTHN_DATA_PUBLISHER_PROXY.equalsIgnoreCase
                (publisher.getName())) {
            AuthenticationDataPublisherDataHolder.getInstance().getDataPublishers().add(publisher);
            Collections.sort(AuthenticationDataPublisherDataHolder.getInstance().getDataPublishers(),
                    new MessageHandlerComparator(null));
            Collections.reverse(AuthenticationDataPublisherDataHolder.getInstance().getDataPublishers());
        }
    }

    protected void unsetAuthenticationDataPublisher(AuthenticationDataPublisher publisher) {
        AuthenticationDataPublisherDataHolder.getInstance().getDataPublishers().remove(publisher);
    }

}
