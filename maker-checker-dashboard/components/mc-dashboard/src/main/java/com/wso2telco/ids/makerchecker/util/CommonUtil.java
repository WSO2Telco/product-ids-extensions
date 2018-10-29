package com.wso2telco.ids.makerchecker.util;

import javax.servlet.http.HttpServletRequest;

public class CommonUtil {
    public static String constructServerUrl(HttpServletRequest request) {
        StringBuilder serverUrlBuilder = new StringBuilder();
        serverUrlBuilder.append(request.getScheme())
                .append("://")
                .append(request.getServerName())
                .append(":")
                .append(request.getServerPort());
        return serverUrlBuilder.toString();
    }
}
