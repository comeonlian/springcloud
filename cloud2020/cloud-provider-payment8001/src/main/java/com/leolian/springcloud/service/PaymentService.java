package com.leolian.springcloud.service;

import com.leolian.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/12 17:34
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") long id);

}
