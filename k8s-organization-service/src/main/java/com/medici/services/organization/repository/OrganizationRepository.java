package com.medici.services.organization.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medici.services.organization.model.Organization;

@RepositoryRestResource
public interface OrganizationRepository extends CrudRepository<Organization, String> {

}
