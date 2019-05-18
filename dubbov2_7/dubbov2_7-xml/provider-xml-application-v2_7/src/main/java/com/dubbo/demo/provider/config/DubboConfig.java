package com.dubbo.demo.provider.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:dubbo/dubbo-provider.xml")
public class DubboConfig {
}
