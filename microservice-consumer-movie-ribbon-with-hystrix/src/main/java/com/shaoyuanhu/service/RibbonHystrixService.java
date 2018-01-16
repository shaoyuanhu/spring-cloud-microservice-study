package com.shaoyuanhu.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shaoyuanhu.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: ShaoYuanHu
 * @Date: Created in 2018-01-16
 */
@Service
public class RibbonHystrixService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id){
        User user = restTemplate.getForObject("http://microservice-provider-uesr/" + id, User.class);
        return user;
    }

    public User fallback(Long id){
        LOGGER.info("发生异常，进入fallback方法，参数：id = {}",id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }

}
