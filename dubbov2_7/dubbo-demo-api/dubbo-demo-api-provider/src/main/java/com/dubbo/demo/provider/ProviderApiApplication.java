package com.dubbo.demo.provider;

import com.dubbo.demo.DemoService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

/**
 * @Date: 2019/4/19 17:41
 * @Description: ${description}
 * @ProjectName: dubbov2_7
 * @Package: com.dubbo.demo.provider
 * @ClassName: ProviderApiApplication
 * @Author: Zaney
 * @Version: 1.0
 */
//@SpringBootApplication
public class ProviderApiApplication {
    public static void main(String[] args) {
        ReferenceConfig<DemoService> reference = new ReferenceConfig<>();
        reference.setApplication(new ApplicationConfig("dubbo-demo-api-consumer"));
        reference.setRegistry(new RegistryConfig("zookeeper://10.20.11.116:2181"));
        reference.setInterface(DemoService.class);
        DemoService service = reference.get();
        String message = service.sayHello("dubbo");
        System.out.println(message);
    }
}
