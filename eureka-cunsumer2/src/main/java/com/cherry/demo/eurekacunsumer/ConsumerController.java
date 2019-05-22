package com.cherry.demo.eurekacunsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/13 2:36 PM
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloRemote2 helloRemote;

    @RequestMapping("/hello2/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
//        return "";
    }
}
