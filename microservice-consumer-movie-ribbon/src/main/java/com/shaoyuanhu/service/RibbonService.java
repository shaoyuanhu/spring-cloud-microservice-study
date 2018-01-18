package com.shaoyuanhu.service;

import com.shaoyuanhu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: ShaoYuanHu
 * @Date: Created in 2018-01-15
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id){
        //第一个参数为： http://服务提供者的serviceId/restUrl
        User user = restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
        return user;
    }

}
