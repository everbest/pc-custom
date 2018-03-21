package com.sky.pcCustom.dao;

import com.sky.pcCustom.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    /**
     * Search database according the username and password
     * @param username
     * @param password
     * @return
     */
    User queryByNamePw(@Param("username") String username,@Param("password") String password);

}
