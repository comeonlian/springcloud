package com.leolian.springcloud.alibaba.seata.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.leolian.springcloud.alibaba.seata.dao"})
public class MyBatisConfig {
 
}
