package com.medici.services.manager.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.medici.services.manager.model.Manager;
import com.medici.services.manager.repository.ManagerRepository;

@Configuration
@EntityScan(basePackageClasses = { Manager.class })
@EnableMongoRepositories(basePackageClasses = { ManagerRepository.class })
@EnableAutoConfiguration
public class AutoConfiguration {

}
