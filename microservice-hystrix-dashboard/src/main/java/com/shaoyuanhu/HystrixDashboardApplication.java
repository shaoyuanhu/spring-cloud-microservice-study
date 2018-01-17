package com.shaoyuanhu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 使用@EnableHystrixDashboard注解开启 Hystrix Dashboard功能
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HystrixDashboardApplication.class, args);
		new SpringApplicationBuilder(HystrixDashboardApplication.class).web(true).run(args);
	}
}
