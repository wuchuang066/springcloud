package com.zpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEmpEureka03Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEmpEureka03Application.class, args);
	}
	
}
