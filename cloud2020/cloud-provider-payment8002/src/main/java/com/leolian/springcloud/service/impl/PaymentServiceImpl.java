package com.leolian.springcloud.service.impl;

import com.leolian.springcloud.dao.PaymentDao;
import com.leolian.springcloud.entity.Payment;
import com.leolian.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/12 17:35
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }

}
