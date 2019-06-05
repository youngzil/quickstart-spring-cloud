/**
 * 项目名称：quickstart-spring-cloud 
 * 文件名：RegistryApplication.java
 * 版本信息：
 * 日期：2017年7月9日
 * Copyright yangzl Corporation 2017
 * 版权所有 *
 */
package org.quickstart.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * RegistryApplication
 * 
 * @author：youngzil@163.com
 * @2017年7月9日 下午12:32:25
 * @version 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryApplication.class, args);
    }
}
