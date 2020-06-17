package com.leolian.ribbon;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author lianliang
 * @date 2020/4/19 11:38
 */
@Configuration
public class RuleConfig {

//    @Bean
//    public IRule randomRule() {
//        return new RandomRule();
//    }


    @Bean
    public IRule myDefineRule() {
        return new MyDefineRule();
    }

}
