package com.cloud.feign.user.controller;

import com.cloud.feign.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    /**
     * @return
     */
    @RequestMapping("/getUser")
    public Object getUser(){
        return userService.getUser();
    }
    /**
     * @return
     */
    @RequestMapping("/setUser")
    public Object setUser(){
        return userService.setUser();
    }
}
