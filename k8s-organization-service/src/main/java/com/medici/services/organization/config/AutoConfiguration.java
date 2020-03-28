package com.medici.services.organization.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.medici.services.organization.model.Organization;
import com.medici.services.organization.repository.OrganizationRepository;

@Configuration
@EntityScan(basePackageClasses = { Organization.class })
@EnableMongoRepositories(basePackageClasses = { OrganizationRepository.class })
@EnableAutoConfiguration
public class AutoConfiguration {

}
