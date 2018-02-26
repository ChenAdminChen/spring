package com.controller;

import com.biz.UserService;
import com.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chen on 2018/2/10.
 */
//@Controller("/testController")
//@RestController
//@EnableAutoConfiguration
@Controller
@RequestMapping("/testController")
public class TestController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser(@RequestParam("id")Integer id){
        User user = userService.getUser(id);
        return user;
    }

    /**
     *useing put method that update user information
     * @param user
     * @return
     */
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public int updateUser(User user){
        int result = userService.updateUser(user);
        return result;
    }
}
