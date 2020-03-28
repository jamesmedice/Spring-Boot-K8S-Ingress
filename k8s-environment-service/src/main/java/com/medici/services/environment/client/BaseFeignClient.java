package com.medici.services.environment.client;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

public interface BaseFeignClient {

	@GetMapping("/environment/")
	Map<String, String> getEnvironmentVariables();
}
