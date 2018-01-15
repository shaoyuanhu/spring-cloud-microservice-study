package com.shaoyuanhu.controller;

import com.shaoyuanhu.client.UserFeignClient;
import com.shaoyuanhu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ShaoYuanHu
 * @Date: Created in 2018-01-15
 */
@RestController
public class FeignController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/feign/{id}")
    public User findByIdFeign(@PathVariable Long id){
        User user = userFeignClient.findByIdFeign(id);
        return user;
    }

}
