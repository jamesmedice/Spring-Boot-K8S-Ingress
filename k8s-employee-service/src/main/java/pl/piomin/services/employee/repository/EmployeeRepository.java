package pl.piomin.services.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import pl.piomin.services.employee.model.Employee;

@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, String> {

	List<Employee> findByDepartmentId(Long departmentId);

	List<Employee> findByOrganizationId(Long organizationId);

}
