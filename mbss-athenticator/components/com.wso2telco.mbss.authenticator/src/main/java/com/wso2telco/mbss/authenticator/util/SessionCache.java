package com.wso2telco.mbss.authenticator.util;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class SessionCache {
    private static LoadingCache<String, Integer> sessionCache = CacheBuilder.newBuilder()
            .maximumSize(1000)
            .expireAfterAccess(15, TimeUnit.MINUTES)
            .build(
                    new CacheLoader<String, Integer>() {
                        @Override
                        public Integer load(String key) throws Exception {
                            return SessionAuthenticatorDbUtil.getActiveSessionCount(key);
                        }
                    }
            );

    public static Integer getActiveSessionCount(String username, String serviceProviderName) throws ExecutionException {
        return sessionCache.get(username + ":" + serviceProviderName);
    }

    public static void updateActiveSessionCount(String username, String serviceProviderName) throws ExecutionException {
            sessionCache.refresh(username + ":" + serviceProviderName);
    }
}
