package com.sc.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @description: 1
 * @author: 沈陈
 * @create: 2020-11-04 10:55
 **/
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder rotes = routeLocatorBuilder.routes();
        rotes.route("path_route_sc", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return rotes.build();
    }

}
