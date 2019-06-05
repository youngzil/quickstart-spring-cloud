/**
 * 项目名称：quickstart-spring-cloud-web 
 * 文件名：Application.java
 * 版本信息：
 * 日期：2018年5月16日
 * Copyright yangzl Corporation 2018
 * 版权所有 *
 */
package org.quickstart.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Application 
 *  
 * @author：youngzil@163.com
 * @2018年5月16日 下午5:06:30 
 * @since 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
