/*******************************************************************************
 * Copyright (c) 2015-2018, WSO2.Telco Inc. (http://www.wso2telco.com)
 *
 * All Rights Reserved. WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.dep.tokenregenerator;

import org.wso2.carbon.apimgt.impl.APIManagerConfigurationService;
import org.wso2.carbon.user.core.service.RealmService;

public class DataHolder {

    private  RealmService realmService;
    private static volatile DataHolder dataHolder;
    private APIManagerConfigurationService apiManagerConfigurationService;

    private DataHolder() {

    }

    public static DataHolder getInstance() {

        if (dataHolder == null) {

            synchronized (DataHolder.class) {
                if (dataHolder == null) {
                    dataHolder = new DataHolder();
                }
            }

        }

        return dataHolder;
    }

    public void setRealmService(RealmService realmService) {
        this.realmService = realmService;
    }

    public RealmService getRealmService() {
        return realmService;
    }

    public void setApiManagerConfigurationService(APIManagerConfigurationService apiManagerConfigurationService) {
        this.apiManagerConfigurationService = apiManagerConfigurationService;
    }

    public APIManagerConfigurationService getApiManagerConfigurationService() {return apiManagerConfigurationService;}

}
