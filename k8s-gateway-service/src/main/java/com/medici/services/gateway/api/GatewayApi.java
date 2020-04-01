package com.medici.services.gateway.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.medici.services.gateway.filters.ErrorFilter;
import com.medici.services.gateway.filters.PostFilter;
import com.medici.services.gateway.filters.PreFilter;
import com.medici.services.gateway.filters.RouteFilter;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Configuration
@EnableAutoConfiguration
public class GatewayApi {

	private static final String _2_0_SWAGGER_VERSION_ = "2.0";
	private static final String V2_API_DOCS = "/v2/api-docs";

	@Autowired
	ZuulProperties properties;

	@Primary
	@Bean
	public SwaggerResourcesProvider swaggerResourcesProvider() {
		return () -> {
			List<SwaggerResource> resources = new ArrayList<>();
			properties.getRoutes().values().stream().forEach(route -> resources.add(createResource(route.getId(), _2_0_SWAGGER_VERSION_)));
			return resources;
		};
	}

	private SwaggerResource createResource(String location, String version) {
		SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName(location);
		swaggerResource.setLocation("/" + location + V2_API_DOCS);
		swaggerResource.setSwaggerVersion(version);
		return swaggerResource;
	}

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
