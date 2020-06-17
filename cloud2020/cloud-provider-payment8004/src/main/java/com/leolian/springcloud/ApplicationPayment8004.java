package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/15 22:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationPayment8004 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationPayment8004.class, args);
    }

}
