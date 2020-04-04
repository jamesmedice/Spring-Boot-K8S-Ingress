package com.medici.services.organization.model;

import java.util.List;

import org.springframework.data.annotation.Id;
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
@Document(collection = "organization")
public class Organization {

	@Id
	private String id;
	private String name;
	private String address;
	private List<Department> departments;
	private List<Employee> employees;
	private List<Manager> managers;
	private Ambassador ambassador;

}
