package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/15 22:38
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationOrderZk80 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationOrderZk80.class, args);
    }

}
