package com.leolian.springcloud;

import com.leolian.ribbon.RuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/12 18:23
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = RuleConfig.class)
public class ApplicationOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationOrder80.class, args);
    }

}
