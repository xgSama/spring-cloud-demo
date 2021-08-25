package com.xgsama.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * GateWayConfig
 *
 * @author : xgSama
 * @date : 2021/8/25 20:27:50
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("test_route",
                r -> r.path("/anime")
                        .uri("https://www.bilibili.com"));

        return routes.build();
    }
}
