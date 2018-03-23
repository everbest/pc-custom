package com.sky.pcCustom.controller;

import com.sky.pcCustom.dto.LogInfo;
import com.sky.pcCustom.service.LoginService;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    public LoginService loginService;

    @RequestMapping(value = "/sign_in",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    public LogInfo SignIn(@RequestParam("username") String username,@RequestParam("password") String password){
        logger.warn("username:"+username);
        logger.warn("password:"+password);
        return loginService.getUserInfo(username,password);
    }

}
