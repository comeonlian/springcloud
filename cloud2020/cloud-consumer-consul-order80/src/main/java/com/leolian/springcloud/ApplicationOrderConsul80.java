package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/18 15:38
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationOrderConsul80 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationOrderConsul80.class, args);
    }

}
