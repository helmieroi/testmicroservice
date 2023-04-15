package com.mycompany.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.app.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
}
