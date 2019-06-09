package com.zpark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.zpark.mapper")
@EnableDiscoveryClient
public class SpringCloudEmpProvider03Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEmpProvider03Application.class, args);
	}
	
}
