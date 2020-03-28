package com.medici.services.department.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.medici.services.department.model.Department;

@RepositoryRestResource
public interface DepartmentRepository extends CrudRepository<Department, String> {

	List<Department> findByOrganizationId(Long organizationId);

}
