package com.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2018/2/7.
 */
@RestController
@EnableAutoConfiguration

public class Hello1 {
    @RequestMapping("/hello")
    String home(){
        return "hello world";
    }
}
