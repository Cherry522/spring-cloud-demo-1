package com.cherry.demo.eurekaproduct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/13 11:45 AM
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam("name") String name) {
        return "hello "+name+"，this is first messge";
    }
}
