package com.medici.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EnvironmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnvironmentApplication.class, args);
	}

}
