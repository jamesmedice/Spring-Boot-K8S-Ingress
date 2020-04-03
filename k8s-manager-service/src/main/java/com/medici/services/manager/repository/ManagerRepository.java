package com.medici.services.manager.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medici.services.manager.model.Manager;

@RepositoryRestResource
public interface ManagerRepository extends CrudRepository<Manager, String> {

	List<Manager> findByDepartmentId(Long departmentId);

	List<Manager> findByOrganizationId(Long organizationId);

}
