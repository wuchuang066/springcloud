package com.zpark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.zpark.mapper")
@EnableDiscoveryClient
public class SpringCloudDeptProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDeptProviderApplication.class, args);
	}

}
