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
public class ProviderV2_7Application {

    public static void main(String[] args) throws IOException {
        String str27 = "override%3A%2F%2F10.20.11.118%3A26880%2Fcom.bocloud.boms.framework.dubbo.DemoService%3Fcategory%3Dconfigurators%26disabled%3Dtrue%26dynamic%3Dfalse%26enabled%3Dtrue";
        String str26 = "override%3A%2F%2F10.20.11.118%3A26880%2Fcom.bocloud.boms.framework.dubbo.DemoService%3Fcategory%3Dconfigurators%26disabled%3Dtrue%26dynamic%3Dfalse%26enabled%3Dtrue";
        System.out.println(str26.equals(str27));
        //		SpringApplication.run(ProviderV2_7Application.class, args);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo/dubbo-provider.xml");
//        context.start();
//        System.in.read();
    }
}
