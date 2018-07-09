package org.quickstart.spring.cloud.sleuth.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ZipkinApplication {

    // http://localhost:9411/

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }

}
