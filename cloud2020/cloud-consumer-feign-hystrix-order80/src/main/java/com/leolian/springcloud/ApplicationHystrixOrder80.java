package com.leolian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/21 22:01
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class ApplicationHystrixOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationHystrixOrder80.class, args);
    }

}
