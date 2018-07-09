package org.quickstart.spring.cloud.eureka.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 翟永超
 * @create 2017/6/24.
 * @blog http://blog.didispace.com
 */
@FeignClient("eureka-provider")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
