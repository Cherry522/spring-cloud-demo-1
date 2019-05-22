package com.cherry.demo.eurekaproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient//启用服务发现
@EnableHystrixDashboard//启用Hystrix的可视化界面
@EnableFeignClients
@EnableCircuitBreaker
@RestController
public class EurekaProductApplication {

    @RequestMapping(value = {"","/"})
    public String index() {
        return "欢迎访问EurekaProduct服务";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaProductApplication.class, args);
    }

}
