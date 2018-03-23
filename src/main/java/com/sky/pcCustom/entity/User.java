package com.sky.pcCustom.entity;

import java.util.Date;

public class User {
    private Long userId;

    private String username;

    private String password;

    private String token;

    private Date createTime;

    private Date tokenTime;

    //blank constructor for mybatis to map
    public User(){}

    public User(Long userId, String username, String password, String token, Date createTime, Date tokenTime) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.token = token;
        this.createTime = createTime;
        this.tokenTime = tokenTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getTokenTime() {
        return tokenTime;
    }

    public void setTokenTime(Date tokenTime) {
        this.tokenTime = tokenTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                ", createTime=" + createTime +
                ", tokenTime=" + tokenTime +
                '}';
    }
}

