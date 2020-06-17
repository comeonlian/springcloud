package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/11 20:57
 */
@SpringBootApplication
@EnableEurekaClient
public class ApplicationPayment8001 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationPayment8001.class);
    }

}
