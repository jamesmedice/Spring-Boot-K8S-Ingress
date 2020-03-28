package com.medici.services.department.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.medici.services.department.model.Department;
import com.medici.services.department.repository.DepartmentRepository;

@Configuration
@EntityScan(basePackageClasses = { Department.class })
@EnableMongoRepositories(basePackageClasses = { DepartmentRepository.class })
@EnableAutoConfiguration
public class AutoConfiguration {

}
