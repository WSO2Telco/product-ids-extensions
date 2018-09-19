package com.wso2telco.mbss.authenticator.model;

public class AuthorizeRoleResponse {
    public static final int RESPONSE_TYPE_OK = 1;
    public static final int RESPONSE_TYPE_RESTRICTED_TIME = 2;

    private int responseType;
    private String username;
    private String message;
    private String role;

    public AuthorizeRoleResponse(int type, String message, String username, String role) {
        this.responseType = type;
        this.message = message;
        this.username = username;
        this.role = role;
    }

    public int getResponseType() {
        return responseType;
    }

    public void setResponseType(int responseType) {
        this.responseType = responseType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
