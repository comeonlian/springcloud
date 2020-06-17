package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/18 15:18
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationPayment8006 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationPayment8006.class, args);
    }

}
