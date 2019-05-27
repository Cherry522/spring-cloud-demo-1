package com.demo.cherry.gatewayservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy//启用网关路由
public class GatewayServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceZuulApplication.class, args);
    }

}
