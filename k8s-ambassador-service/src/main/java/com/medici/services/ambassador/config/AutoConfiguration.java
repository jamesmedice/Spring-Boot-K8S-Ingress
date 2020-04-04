package com.medici.services.ambassador.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.medici.services.ambassador.model.Ambassador;
import com.medici.services.ambassador.repository.AmbassadorRepository;

@Configuration
@EntityScan(basePackageClasses = { Ambassador.class })
@EnableMongoRepositories(basePackageClasses = { AmbassadorRepository.class })
@EnableAutoConfiguration
public class AutoConfiguration {

}
