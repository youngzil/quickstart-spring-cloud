package org.quickstart.spring.cloud.zuul.api.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class Application {
    /*
    由于Spring Cloud Zuul在整合了Eureka之后，具备默认的服务路由功能，即：
    当我们这里构建的api-gateway应用启动并注册到eureka之后，服务网关会发现上面我们启动的两个服务eureka-client和eureka-consumer，
    这时候Zuul就会创建两个路由规则。每个路由规则都包含两部分，一部分是外部请求的匹配规则，另一部分是路由的服务ID。
    针对当前示例的情况，Zuul会创建下面的两个路由规则：
    转发到eureka-client服务的请求规则为：/eureka-client/**
    转发到eureka-consumer服务的请求规则为：/eureka-consumer/**
    最后，我们可以通过访问1101端口的服务网关来验证上述路由的正确性：
    比如访问：http://localhost:1101/eureka-client/dc ，该请求将最终被路由到eureka-client的/dc接口上。
    */
    // http://localhost:1101/eureka-provider/dc
    // http://localhost:1101/eureka-consumer/consumer

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}
