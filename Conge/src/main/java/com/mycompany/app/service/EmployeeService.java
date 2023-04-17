package com.mycompany.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.app.model.Employee;
import com.mycompany.app.repository.EmployeeRepository;

import lombok.AllArgsConstructor;
@Service 
public interface EmployeeService {
    List<Employee> getAllEmployees(); 
    Employee getEmployeeById(Long id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long id);
    @Autowired
    void setEmployeeRepository(EmployeeRepository employeeRepository);
}