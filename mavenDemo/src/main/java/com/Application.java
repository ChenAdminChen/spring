package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by chen on 2018/2/10.
 */

/**
 * 用于项目启动的入口，若为web项目：则启动tomact
 */
@SpringBootApplication
public class Application {
     public static void main(String args[]) {
         ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
      }
}
