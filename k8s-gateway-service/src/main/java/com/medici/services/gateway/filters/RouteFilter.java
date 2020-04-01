package com.medici.services.gateway.filters;

import java.util.logging.Logger;

import com.netflix.zuul.ZuulFilter;

public class RouteFilter extends ZuulFilter {

	protected Logger logger = Logger.getLogger(RouteFilter.class.getName());

	@Override
	public String filterType() {
		return "route";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		logger.info("Inside Route Filter");

		return null;
	}

}