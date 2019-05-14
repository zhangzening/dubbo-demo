package com.dubbo.demo.provider;

import com.dubbo.demo.UserService;
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
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public String saveUser(String name) {
        logger.info("dubbo v2.7: save user " + name + " info , request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "dubbo v2.7: save user " + name + " info  , response from provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public String getUser(String name) {
        logger.info("dubbo v2.7:  get user " + name + " info , request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "dubbo v2.7: get user " + name + " info  , response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
