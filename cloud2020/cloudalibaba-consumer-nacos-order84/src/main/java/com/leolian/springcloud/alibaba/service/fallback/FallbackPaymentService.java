package com.leolian.springcloud.alibaba.service.fallback;

import com.leolian.springcloud.alibaba.service.PaymentService;
import com.leolian.springcloud.entity.CommonResult;
import com.leolian.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author lianliang
 * @date 2020/5/31 23:19
 */
@Component
public class FallbackPaymentService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(446, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }

}
