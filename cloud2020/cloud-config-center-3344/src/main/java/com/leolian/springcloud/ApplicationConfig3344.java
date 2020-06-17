package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/5/3 17:52
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ApplicationConfig3344 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfig3344.class, args);
    }

}
