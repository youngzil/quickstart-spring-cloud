package org.quickstart.spring.cloud.zuul.api.gateway.eureka;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class Application {

    // http://localhost:1101/api-a/dc：返回401错误
    // http://localhost:1101/api-a/dc?accessToken=token：正确路由到hello-service的/hello接口，并返回Hello World

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
