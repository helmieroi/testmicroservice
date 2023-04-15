package com.mycompany.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.app.model.Employee;
import com.mycompany.app.repository.EmployeeRepository;

public interface EmployeeService {
    List<Employee> getAllEmployees(); 
    Employee getEmployeeById(Long id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    @Autowired
    void setEmployeeRepository(EmployeeRepository employeeRepository);
}