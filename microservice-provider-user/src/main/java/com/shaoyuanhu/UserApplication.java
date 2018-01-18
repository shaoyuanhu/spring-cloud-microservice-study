package com.shaoyuanhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类
 * @EnableDiscoveryClient: 使用该注解将本服务注册到Eureka上去
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}
