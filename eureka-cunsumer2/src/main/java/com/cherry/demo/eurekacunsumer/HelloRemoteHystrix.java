package com.cherry.demo.eurekacunsumer;

import org.springframework.stereotype.Component;

/**
 * Describe:熔断服务实现
 * User: chenyan
 * Date: 2019/5/13 3:14 PM
 */
@Component
public class HelloRemoteHystrix implements HelloRemote2{
    @Override
    public String hello(String name) {
        return "hello " +name+", 服务发送失败！";
    }
}
