package com.shaoyuanhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 使用@EnableCircuitBreaker不是为了开启断路器，而是为了使用dashboard查看监控情况
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class MovieFeignHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieFeignHystrixApplication.class, args);
	}
}
