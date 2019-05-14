package com.dubbo.demo.provider;

import com.dubbo.demo.DemoService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Date: 2019/4/18 13:55
 * @Description: ${description}
 * @ProjectName: dubbov2_7
 * @Package: com.dubbo.demo
 * @ClassName: DemoServiceImpl
 * @Author: Zaney
 * @Version: 1.0
 */
@Slf4j
public class DemoServiceImpl implements DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String sayHello(String name) {
        logger.info("dubbo v2.7: Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "dubbo v2.7: Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }

}
