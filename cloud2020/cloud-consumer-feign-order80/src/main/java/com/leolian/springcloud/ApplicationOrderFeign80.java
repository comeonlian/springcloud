package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/19 13:42
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ApplicationOrderFeign80 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationOrderFeign80.class, args);
    }

}
