package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/5/4 13:31
 */
@SpringBootApplication
@EnableEurekaClient
public class ApplicationConfigClient3366 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigClient3366.class, args);
    }

}
