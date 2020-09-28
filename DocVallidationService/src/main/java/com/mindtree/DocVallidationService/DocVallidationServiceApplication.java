package com.mindtree.DocVallidationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@EnableFeignClients("com.mindtree.documentVallidationService")
@SpringBootApplication
public class DocVallidationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocVallidationServiceApplication.class, args);
	}

}
