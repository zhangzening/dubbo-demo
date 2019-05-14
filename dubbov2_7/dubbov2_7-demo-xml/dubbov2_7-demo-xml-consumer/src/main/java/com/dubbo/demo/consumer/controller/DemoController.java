package com.dubbo.demo.consumer.controller;

import com.dubbo.demo.DemoService;
import org.apache.dubbo.common.Constants;
import org.apache.dubbo.common.utils.StringUtils;
import org.apache.dubbo.rpc.RpcContext;
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
//        RpcContext.getContext().setAttachment(Constants.TAG_KEY,"tag1");
//        RpcContext.getContext().setAttachment(Constants.FORCE_USE_TAG,"true");
        String s = demoService.sayHello(name);
        System.out.println("------->>> " + s);
        return "success  from " + s;
    }
}
