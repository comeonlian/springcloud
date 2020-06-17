package com.leolian.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/18 15:19
 */
@RestController
@Slf4j
public class ConsulPaymentController {


    @Value("${server.port}")
    private String port;


    @GetMapping(value = "/payment/consul")
    public String paymentConsul() {
        return "springcloud with consul: " + port + "\t" + UUID.randomUUID().toString();
    }


}
