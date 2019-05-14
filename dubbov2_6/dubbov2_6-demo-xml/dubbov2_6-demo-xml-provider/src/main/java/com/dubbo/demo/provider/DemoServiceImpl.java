package com.dubbo.demo.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import com.dubbo.demo.DemoService;
import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author songsong
 * @since 2019/3/14
 **/
@Slf4j
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        log.info("dubbo v2.6: Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "dubbo v2.6: Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
