package com.leolian.springcloud.alibaba.service;

import com.leolian.springcloud.alibaba.service.fallback.FallbackPaymentService;
import com.leolian.springcloud.entity.CommonResult;
import com.leolian.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @author lianliang
 * @date 2020/5/31 23:17
 */
@FeignClient(value = "nacos-payment-provider", fallback = FallbackPaymentService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}
