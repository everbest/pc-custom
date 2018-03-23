package com.sky.pcCustom.service.impl;

import com.sky.pcCustom.dao.UserDao;
import com.sky.pcCustom.dto.LogInfo;
import com.sky.pcCustom.entity.User;
import com.sky.pcCustom.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Override
    public LogInfo getUserInfo(String username, String password) {
        logger.info("Service---username:"+username);
        logger.info("Service---password:"+password);
        User user=userDao.queryByNamePw(username,password);
        logger.warn(user.toString());
        LogInfo info=new LogInfo(true,user.getUsername(),user.getToken());
        return info;
    }
}
