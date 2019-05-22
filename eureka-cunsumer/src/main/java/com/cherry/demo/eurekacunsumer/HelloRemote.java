package com.cherry.demo.eurekacunsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/13 2:34 PM
 */
//name:远程服务名，及spring.application.name配置的名称
//此类中的方法和远程服务中contoller中的方法名和参数需保持一致
//fallback:在服务熔断的时候返回fallback类中的内容
@FeignClient(name="eureka-product",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping("/hello")
    String hello(@RequestParam("name") String name);
}
