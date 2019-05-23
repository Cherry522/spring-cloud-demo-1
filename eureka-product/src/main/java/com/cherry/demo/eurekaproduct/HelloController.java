package com.cherry.demo.eurekaproduct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/13 11:45 AM
 */
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中
public class HelloController {

    @Value("${chenyan.test.hello}")
    private String testHello;

    @RequestMapping(value = "/hello")
    public String index(@RequestParam("name") String name) {

        return "hello "+name+"，this is first messge;;;;;"+testHello;
    }
}
