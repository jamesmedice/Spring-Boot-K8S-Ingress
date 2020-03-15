package pl.piomin.services.organization.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import pl.piomin.services.organization.model.Organization;
import pl.piomin.services.organization.repository.OrganizationRepository;

@Configuration
@EntityScan(basePackageClasses = { Organization.class })
@EnableMongoRepositories(basePackageClasses = { OrganizationRepository.class })
@EnableAutoConfiguration
public class AutoConfiguration {

}
