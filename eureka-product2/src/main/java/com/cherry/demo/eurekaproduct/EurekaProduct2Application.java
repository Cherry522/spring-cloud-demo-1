package com.cherry.demo.eurekaproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient//启用服务发现
@EnableFeignClients
@RestController
public class EurekaProduct2Application {

    @RequestMapping(value = "")
    public String index() {
        return "欢迎访问EurekaProduct2服务";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaProduct2Application.class, args);
    }

}
