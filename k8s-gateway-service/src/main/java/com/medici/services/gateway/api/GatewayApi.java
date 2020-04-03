package com.medici.services.gateway.api;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.medici.services.gateway.filters.ErrorFilter;
import com.medici.services.gateway.filters.PostFilter;
import com.medici.services.gateway.filters.PreFilter;
import com.medici.services.gateway.filters.RouteFilter;

@Configuration
@EnableAutoConfiguration
public class GatewayApi {

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
