package com.zpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEmpEureka01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEmpEureka01Application.class, args);
	}
	
}
