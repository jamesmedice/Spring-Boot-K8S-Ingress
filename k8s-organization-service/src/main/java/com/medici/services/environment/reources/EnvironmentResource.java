package com.medici.services.environment.reources;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author a73s
 *
 */
@RestController
public class EnvironmentResource {

	protected Logger logger = Logger.getLogger(EnvironmentResource.class.getName());

	@Autowired
	Environment environment;

	@RequestMapping(value = "/activeProfiles/", method = RequestMethod.GET)
	public String[] activeProfiles() {
		logger.info("microservice activeProfiles() invoked");
		return environment.getActiveProfiles();
	}

}
