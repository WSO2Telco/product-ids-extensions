package com.wso2telco.ids.makerchecker.dto;

public class HumanTaskInfoDto {
    private String requestId;
    private String username;
    private String userStoreDomain;
    private String roles;
    private String claims;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserStoreDomain() {
        return userStoreDomain;
    }

    public void setUserStoreDomain(String userStoreDomain) {
        this.userStoreDomain = userStoreDomain;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getClaims() {
        return claims;
    }

    public void setClaims(String claims) {
        this.claims = claims;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("[\nID: ").append(requestId).append(", \n")
                .append("Username: ").append(username).append(", \n")
                .append("User Store Domain: ").append(userStoreDomain).append(", \n")
                .append("Roles: ").append(roles).append(", \n")
                .append("Claims: ").append(claims).append(", \n")
                .append("]").toString();
    }
}
