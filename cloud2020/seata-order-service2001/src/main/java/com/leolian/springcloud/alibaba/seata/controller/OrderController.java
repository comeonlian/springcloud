package com.leolian.springcloud.alibaba.seata.controller;

import com.leolian.springcloud.alibaba.seata.domain.CommonResult;
import com.leolian.springcloud.alibaba.seata.domain.Order;
import com.leolian.springcloud.alibaba.seata.service.AccountService;
import com.leolian.springcloud.alibaba.seata.service.OrderService;
import com.leolian.springcloud.alibaba.seata.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;


    /**
     * http://127.0.0.1:2001/order/create?userId=1&productId=1&count=8&money=18
     *
     * @param order
     * @return
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }


    /**
     * /account/decrease?userId=1&money=8
     * @param userId
     * @param money
     * @return
     */
    @GetMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣减账户余额成功！");
    }


    /**
     * /storage/decrease?productId=1&count=8
     * @param productId
     * @param count
     * @return
     */
    @GetMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200, "扣减库存成功！");
    }


}
