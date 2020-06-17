package com.leolian.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/5/16 21:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelMainApp8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelMainApp8401.class, args);
    }

}
