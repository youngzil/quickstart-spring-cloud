package org.quickstart.spring.cloud.eureka.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 翟永超
 * @create 2017/4/15.
 * @blog http://blog.didispace.com
 */
@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
//        Thread.sleep(5000L);//测试quickstart-spring-cloud-eureka-consumer-ribbon-hystrix时候，测试服务降级时候打开
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
        
        
    }

}
