package com.shaoyuanhu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 这里的@RefreshScope注解一定不能少，否则即使调用/refresh，配置也不会刷新
 * @Author: ShaoYuanHu
 * @Date: Created in 2018-01-16
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @RequestMapping("/hello")
    public String hello(){
        return this.profile;
    }

}
