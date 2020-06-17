package com.leolian.springcloud.controller;

import com.leolian.springcloud.entity.CommonResult;
import com.leolian.springcloud.entity.Payment;
import com.leolian.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/12 17:39
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping("/payment")
    public CommonResult create(@RequestBody Payment payment) {
        CommonResult commonResult = null;
        int result = paymentService.create(payment);
        if (result > 0) {
            commonResult = new CommonResult(200, "插入数据库成功, ServerPort: " + port, result);
        } else {
            commonResult = new CommonResult(410, "插入数据库失败, ServerPort: " + port);
        }
        return commonResult;
    }


    @GetMapping("/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id) {
        CommonResult commonResult = null;
        Payment payment = paymentService.getPaymentById(id);
        if (null == payment) {
            commonResult = new CommonResult(411, "没有查询记录, ServerPort: " + port, id);
        } else {
            commonResult = new CommonResult(200, "查询成功, ServerPort: " + port, payment);
        }
        return commonResult;
    }


    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            log.error("", e);
        }
        return port;
    }


    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        return "hi ,i'am paymentzipkin server fall back，welcome to: " + port + "，O(∩_∩)O哈哈~";
    }


}
