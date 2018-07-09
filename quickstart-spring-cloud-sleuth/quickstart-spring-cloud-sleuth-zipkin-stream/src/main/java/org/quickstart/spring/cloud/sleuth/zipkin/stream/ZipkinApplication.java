package org.quickstart.spring.cloud.sleuth.zipkin.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@EnableZipkinStreamServer
@SpringBootApplication
public class ZipkinApplication {

    // http://localhost:9411/

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }

}
