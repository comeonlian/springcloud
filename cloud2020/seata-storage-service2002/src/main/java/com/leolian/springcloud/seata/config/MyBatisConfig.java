package com.leolian.springcloud.seata.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.leolian.springcloud.seata.dao"})
public class MyBatisConfig {
}
