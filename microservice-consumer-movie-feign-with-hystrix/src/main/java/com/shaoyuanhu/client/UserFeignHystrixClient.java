package com.shaoyuanhu.client;

import com.shaoyuanhu.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: ShaoYuanHu
 * @Date: Created in 2018-01-15
 */
@FeignClient(name = "microservice-provider-uesr" ,fallback = HystrixClientFallback.class)
public interface UserFeignHystrixClient {

    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);

    /*@Component
    static class HystrixClientFallback implements UserFeignHystrixClient {
        private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

        @Override
        public User findByIdFeign(@RequestParam("id") Long id) {
            LOGGER.info("发生异常，进入fallback方法，参数：id = {}",id);
            User user = new User();
            user.setId(-1L);
            user.setUsername("default username");
            user.setAge(0);
            return user;
        }
    }*/

}
