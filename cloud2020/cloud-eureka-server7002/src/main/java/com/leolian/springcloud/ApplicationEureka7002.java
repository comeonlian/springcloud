package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/12 21:59
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka7002 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEureka7002.class, args);
    }

}
