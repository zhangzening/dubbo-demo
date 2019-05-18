package com.dubbo.demo.consumer.controller;

import com.dubbo.demo.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("user")
    @ResponseBody
    public String getUser(String name) {
        String s = userService.getUser(name);
        System.out.println("------->>> " + s);
        return "success  from " + s;
    }

    @GetMapping("user/save")
    @ResponseBody
    public String saveUser(String name) {
        String s = userService.saveUser(name);
        System.out.println("------->>> " + s);
        return "success  from " + s;
    }

}
