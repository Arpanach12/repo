package com.mindtree.regService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@EnableFeignClients("com.mindtree.regService")
@SpringBootApplication
public class RegServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegServiceApplication.class, args);
	}

}
