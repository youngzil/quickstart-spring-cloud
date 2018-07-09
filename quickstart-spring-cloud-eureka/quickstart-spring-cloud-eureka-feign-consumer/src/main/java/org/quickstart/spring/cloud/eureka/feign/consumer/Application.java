package org.quickstart.spring.cloud.eureka.feign.consumer;

import org.quickstart.spring.cloud.eureka.feign.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    
//    http://localhost:2102/test?name=yangzl

	@FeignClient("eureka-feign-provider")
	interface HelloServiceClient extends HelloService {

	}

	@RestController
	class TestController {

		@Autowired
		private HelloServiceClient helloServiceClient;

		@GetMapping("/test")
		public String test(String name) {
			return helloServiceClient.hello(name);
		}

	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}

}
