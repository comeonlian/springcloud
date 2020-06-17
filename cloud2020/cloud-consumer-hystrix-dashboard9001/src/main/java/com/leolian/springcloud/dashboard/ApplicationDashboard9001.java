package com.leolian.springcloud.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/25 19:01
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ApplicationDashboard9001 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationDashboard9001.class, args);
    }

}
