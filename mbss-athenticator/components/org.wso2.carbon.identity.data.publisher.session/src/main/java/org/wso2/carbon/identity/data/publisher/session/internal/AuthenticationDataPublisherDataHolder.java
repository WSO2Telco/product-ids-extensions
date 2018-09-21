package org.wso2.carbon.identity.data.publisher.session.internal;

import org.wso2.carbon.event.stream.core.EventStreamService;
import org.wso2.carbon.identity.application.authentication.framework.AuthenticationDataPublisher;
import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.user.core.service.RealmService;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationDataPublisherDataHolder {

    private EventStreamService publisherService;
    private RealmService realmService;
    private RegistryService registryService;
    private List<AuthenticationDataPublisher> dataPublishers = new ArrayList<>();

    private static AuthenticationDataPublisherDataHolder
            serviceHolder = new AuthenticationDataPublisherDataHolder();

    private AuthenticationDataPublisherDataHolder() {

    }

    public static AuthenticationDataPublisherDataHolder getInstance() {

        return serviceHolder;
    }

    public EventStreamService getPublisherService() {

        return publisherService;
    }

    public void setPublisherService(EventStreamService publisherService) {

        this.publisherService = publisherService;
    }

    public void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

    public void setRegistryService(RegistryService registryService) {

        this.registryService = registryService;
    }

    public RealmService getRealmService() {

        return realmService;
    }

    public RegistryService getRegistryService() {

        return registryService;
    }

    public List<AuthenticationDataPublisher> getDataPublishers() {

        return dataPublishers;
    }
}
