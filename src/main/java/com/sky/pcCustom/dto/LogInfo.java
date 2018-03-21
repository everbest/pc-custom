package com.sky.pcCustom.dto;

public class LogInfo {

    private boolean status;

    private String username;

    private String token;

    public LogInfo(boolean status, String username, String token) {
        this.status = status;
        this.username = username;
        this.token = token;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
