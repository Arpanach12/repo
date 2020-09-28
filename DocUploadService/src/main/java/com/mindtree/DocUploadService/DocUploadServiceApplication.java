package com.mindtree.DocUploadService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@EnableFeignClients("com.mindtree.DocUploadService")
@SpringBootApplication
public class DocUploadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocUploadServiceApplication.class, args);
	}

}
