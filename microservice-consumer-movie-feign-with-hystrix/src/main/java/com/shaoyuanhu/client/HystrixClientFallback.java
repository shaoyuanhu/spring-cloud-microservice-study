package com.shaoyuanhu.client;

import com.shaoyuanhu.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: Hystrix的fallbacl类
 * @Author: ShaoYuanHu
 * @Date: Created in 2018-01-16
 */
@Component
public class HystrixClientFallback implements UserFeignHystrixClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

    /**
     * Hystrix的fallback方法
     * @param id
     * @return
     */
    @Override
    public User findByIdFeign(@RequestParam("id") Long id) {
        LOGGER.info("发生异常，进入fallback方法，参数：id = {}",id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}
