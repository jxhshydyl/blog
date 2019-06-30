package com.lwp.bloggateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Auther: liuweipeng
 * @Date: 2019/5/15 15:20
 * @Description:
 */
public class MyFilter implements GatewayFilter{

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //向headers中放文件，记得build
        ServerHttpRequest host = exchange.getRequest().mutate().header("ui", "ui").build();
        //将现在的request 变成 change对象
        ServerWebExchange build = exchange.mutate().request(host).build();
        return chain.filter(build);
    }

}
