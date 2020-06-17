package com.leolian.springcloud.alibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.leolian.springcloud.entity.CommonResult;


public class CustomerBlockHandler {


    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(445, "自定义限流处理信息....CustomerBlockHandler");
    }


    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(445, "自定义限流处理信息2....CustomerBlockHandler");
    }

}