/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.sample.inforecovery.controller;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.captcha.mgt.beans.xsd.CaptchaInfoBean;
import org.wso2.sample.inforecovery.client.ClientConstants;
import org.wso2.sample.inforecovery.client.UserInformationRecoveryClient;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

public class UserInfoViewController extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final Log log = LogFactory.getLog(UserInfoViewController.class);
    private UserInformationRecoveryClient client;

    public void init() {
        try {
            ConfigurationContext configContext =
                    (ConfigurationContext) this.getServletContext().getAttribute(CarbonConstants.
                            CONFIGURATION_CONTEXT);
            String carbonServerUrl = this.getServletConfig().getServletContext()
                    .getInitParameter("carbonServerUrl");

            client = new UserInformationRecoveryClient(carbonServerUrl, configContext);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,
            IOException {

        this.doPost(req, res);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,
            IOException {

        String radio = req.getParameter("recoveryMethod");
        String storeLoginURL = req.getParameter("redirectStoreUrl");

        HttpSession session = req.getSession(false);

        if (session != null) {

            CaptchaInfoBean captchaInfoBean;

            try {

                captchaInfoBean = client.generateCaptcha();

            } catch (Exception e) {
                return;
            }

            if (captchaInfoBean == null) {
                return;
            }


            //String carbonServerUrl = this.getServletConfig().getServletContext()
            //        .getInitParameter("carbonServerUrl");
            String captchaServerUrl = this.getServletConfig().getServletContext()
                    .getInitParameter("captchaServerUrl");
//			req.setAttribute("carbonServerUrl", carbonServerUrl);

            String captchaImagePath = captchaInfoBean.getImagePath();
            String captchaImageUrl = captchaServerUrl + "/" + captchaImagePath;
            String captchaSecretKey = captchaInfoBean.getSecretKey();

            req.setAttribute("captchaImageUrl", captchaImageUrl);
            req.setAttribute("captchaSecretKey", captchaSecretKey);
            req.setAttribute("captchaImagePath", captchaImagePath);
            req.setAttribute("recoveryMethod", radio);

            ServletContext ctx = this.getServletContext();
            String captchaDisable = ctx.getInitParameter(ClientConstants.CAPTCHA_DISABLE);

            RequestDispatcher dispatcher;
            //set store login url to session
            if (storeLoginURL != null && !storeLoginURL.equals("")) {
                session.setAttribute("storeLoginURL", storeLoginURL);
            }
            if (session.getAttribute("emailConfirmation") != null) {
                req.setAttribute("validateAction", "verify");
                session.setAttribute("confirmation", session.getAttribute("emailConfirmation"));
                session.setAttribute("emailConfirmation", null);
                if (!"true".equals(captchaDisable)) {
                    dispatcher = req.getRequestDispatcher("/recover_confirmation_info.jsp");
                } else {
                    dispatcher = req.getRequestDispatcher("/verify");
                }
            } else {
                session.setAttribute("confirmation", captchaInfoBean.getSecretKey());
                req.setAttribute("validateAction", "validate");
                dispatcher = req.getRequestDispatcher("/recover_request_info.jsp");
            }
            dispatcher.forward(req, res);
        }

    }
}
