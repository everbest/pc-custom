package com.sky.pcCustom;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by sjj on 2018/3/17.
 */

@SpringBootApplication
@MapperScan(value="com.sky.pcCustom.dao")
public class HelloTest {
    public static void main(String args[]) {
        SpringApplication.run(HelloTest.class);
    }

}
