package com.dubbo.demo.consumer.controller;

import com.dubbo.demo.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {
    @Resource
    private DemoService demoService;

    @GetMapping("demo")
    @ResponseBody
    public String demo(String name) {
        String s = demoService.sayHello(name);
        System.out.println("------->>> " + s);
        return "success  from " + s;
    }
}
