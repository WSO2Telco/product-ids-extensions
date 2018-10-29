package com.wso2telco.ids.makerchecker;

public class Constants {
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";

    public static final String SET_COOKIE_HEADER = "Set-Cookie";
    public static final String SESSION_COOKIE = "sessionCookie";

    //SOAP endpoint names
    public static final String AUTHENTICATION_ENDPOINT = "/services/AuthenticationAdmin.AuthenticationAdminHttpsSoap11Endpoint/";
    public static final String HUMAN_TASK_ENDPOINT = "/services/HumanTaskClientAPIAdmin/";

    //human task states
    public static final String APPROVED = "APPROVED";
    public static final String REJECTED = "REJECTED";
    public static final String RELEASED = "RELEASED";
}
