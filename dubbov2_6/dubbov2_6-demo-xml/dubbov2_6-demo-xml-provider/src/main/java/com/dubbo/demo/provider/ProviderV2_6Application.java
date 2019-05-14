package com.dubbo.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ProviderV2_6Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProviderV2_6Application.class, args);
//		SpringApplication.run(ProviderDemoApplication.class, args);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo/dubbo-provider.xml");
//        context.start();
//        System.in.read();
    }

}
