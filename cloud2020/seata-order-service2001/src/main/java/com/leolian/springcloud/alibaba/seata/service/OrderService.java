package com.leolian.springcloud.alibaba.seata.service;

import com.leolian.springcloud.alibaba.seata.domain.Order;

public interface OrderService{
    void create(Order order);
}