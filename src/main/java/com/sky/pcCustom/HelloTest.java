package com.sky.pcCustom;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by sjj on 2018/3/17.
 */

@Controller
@SpringBootApplication
public class HelloTest {
    public static void main(String args[]) {
        SpringApplication.run(HelloTest.class);
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello pc-custome";
    }

}
