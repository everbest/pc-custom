package com.sky.pcCustom.entity;

import java.util.Date;

public class User {
    private String name;

    private String password;

    private String token;

    private Date createTime;

    private Date tokenTime;

    public User(String name, String password, String token, Date createTime, Date tokenTime) {
        this.name = name;
        this.password = password;
        this.token = token;
        this.createTime = createTime;
        this.tokenTime = tokenTime;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                ", createTime=" + createTime +
                ", tokenTime=" + tokenTime +
                '}';
    }
}

