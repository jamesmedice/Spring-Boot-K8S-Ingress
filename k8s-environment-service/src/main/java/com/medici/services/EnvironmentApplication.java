package com.medici.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableSwagger2WebMvc
public class EnvironmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnvironmentApplication.class, args);
	}

}
