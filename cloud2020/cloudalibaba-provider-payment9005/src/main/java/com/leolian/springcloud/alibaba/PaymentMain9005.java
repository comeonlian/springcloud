package com.leolian.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/5/31 22:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9005 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9005.class, args);
    }

}
