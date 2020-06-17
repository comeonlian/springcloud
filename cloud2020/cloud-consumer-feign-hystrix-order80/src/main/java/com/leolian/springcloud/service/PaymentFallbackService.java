package com.leolian.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/21 22:40
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfoOK(Integer id) {
        return "----- PaymentFallbackService fallback paymentInfoOK , (┬＿┬)";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "----- PaymentFallbackService fallback paymentInfoTimeOut , (┬＿┬)";
    }

}
