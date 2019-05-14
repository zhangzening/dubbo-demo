package com.dubbo.demo.provider.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * TODO
 *
 * @author songsong
 * @since 2019/3/14
 **/
@Configuration
@ImportResource("classpath:dubbo/*.xml")
public class DubboConfig {
}
