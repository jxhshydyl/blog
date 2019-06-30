package com.lwp.bloggateway.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: liuweipeng
 * @Date: 2019/5/5 15:53
 * @Description:
 */
@Configuration
public class MyRoutes {
    @Bean
    public RouteLocator myRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("ui",p -> p
                        .path("/ui/**")
                        .filters(f -> f.stripPrefix(1).addRequestHeader("ui","ui"))
                        .uri("lb://blog-ui"))
                .route("comment",p -> p
                        .path("/comment/**")
                        .filters(f -> f.stripPrefix(1).addRequestHeader("comment","comment"))
                        .uri("lb://blog-comment"))
                .route("base",p -> p
                        .path("/base/**")
                        .filters(f -> f.stripPrefix(1).addRequestHeader("",""))
                        .uri("lb://blog-base"))
                .build();
    }
}
