package com.shaoyuanhu.client;

import com.shaoyuanhu.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: 使用@FeignClient(name = "microservice-provider-user")注解绑定服务提供者
 * @Author: ShaoYuanHu
 * @Date: Created in 2018-01-15
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);

}
