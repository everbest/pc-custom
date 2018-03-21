package com.sky.pcCustom.service;

import com.sky.pcCustom.dto.LogInfo;

public interface LoginService {

    /**
     * @param username
     * @param password
     * get user login info
     * @return
     */
    LogInfo getUserInfo(String username, String password);

}
