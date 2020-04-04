package com.medici.services.department.model;

import java.util.List;

import org.apache.catalina.Manager;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Document(collection = "department")
public class Department {

	@Id
	private String id;
	private Long organizationId;
	private String name;
	@Transient
	private List<Employee> employees;

	@Transient
	private Manager manager;

}
