package com.leolian.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @description:
 * @author lianliang
 * @date 2020/5/3 14:49
 */
@Component
@Slf4j
public class MyGlobalFilter implements GlobalFilter, Ordered {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("MyGlobalFilter get request: {}", new Date());
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if(StringUtils.isEmpty(uname)){
            log.info("***** 用户名为Null 非法用户 (┬＿┬)");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    
    @Override
    public int getOrder() {
        return 0;
    }


}
