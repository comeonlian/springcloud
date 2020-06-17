package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/5/3 11:56
 */
@SpringBootApplication
@EnableEurekaClient
public class ApplicationGateway9527 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationGateway9527.class, args);
    }

}
