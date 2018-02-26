package com.controller;

import com.biz.UserService;
import com.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2018/2/7.
 */

//被@EnableAutoConfiguration注解的类所在包将被用来搜索带有@Entity注解的实体类
//@RestController
//@EnableAutoConfiguration
@Controller
/**
 *      这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。
 * 由于spring-boot-starter-web添加了Tomcat和Spring MVC，所以auto-configuration将假定你正在开发一个
 * web应用并相应地对Spring进行设置
 */
@RequestMapping("/hello")
public class Hello {
    @RequestMapping("/")
    String home() {
        return "hello world";
    }

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/user")
    public User getUser(@RequestParam("id")Integer id){
        User user = userService.getUser(id);
        return user;
    }
}
