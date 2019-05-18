package com.dubbo.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @Date: 2019/4/18 14:27
 * @Description: ${description}
 * @ProjectName: dubbov2_7
 * @Package: com.dubbo.demo
 * @ClassName: ProviderApplication
 * @Author: Zaney
 * @Version: 1.0
 */
@SpringBootApplication
public class ProviderV2_7SleepApplication {

    public static void main(String[] args) throws IOException {
		SpringApplication.run(ProviderV2_7SleepApplication.class, args);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo/dubbo-provider.xml");
//        context.start();
//        System.in.read();
    }
}
