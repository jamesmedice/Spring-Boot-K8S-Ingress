package com.medici.services.employee.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.medici.services.employee.model.Employee;
import com.medici.services.employee.repository.EmployeeRepository;

@Configuration
@EntityScan(basePackageClasses = { Employee.class })
@EnableMongoRepositories(basePackageClasses = { EmployeeRepository.class })
@EnableAutoConfiguration
public class AutoConfiguration {

}
