package com.leolian.springcloud.controller;

import com.leolian.springcloud.entity.CommonResult;
import com.leolian.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/12 18:29
 */
@RestController
@Slf4j
public class OrderController {

    private static final String REQUEST_PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment) {
        return restTemplate.postForObject(REQUEST_PAYMENT_URL + "/payment",
                payment,
                CommonResult.class);
    }


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") long id) {
        return restTemplate.getForObject(REQUEST_PAYMENT_URL + "/payment/" + id,
                CommonResult.class);
    }

    
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin() {
        RestTemplate template = new RestTemplate();
        String result = template.getForObject("http://localhost:8001" + "/payment/zipkin/", String.class);
        return result;
    }


}
