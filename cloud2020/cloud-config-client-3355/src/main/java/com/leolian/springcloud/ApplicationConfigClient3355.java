package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/5/4 10:49
 */
@SpringBootApplication
@EnableEurekaClient
public class ApplicationConfigClient3355 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigClient3355.class, args);
    }

}
