package com.shaoyuanhu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class TurbineApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TurbineApplication.class, args);
		new SpringApplicationBuilder(TurbineApplication.class).web(true).run(args);
	}
}
