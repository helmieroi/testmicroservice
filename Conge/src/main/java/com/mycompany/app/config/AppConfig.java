package com.mycompany.app.config;  
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mycompany.app.repository.EmployeeRepository;
import com.mycompany.app.service.EmployeeService;
import com.mycompany.app.service.EmployeeServiceImpl;

@Configuration
public class AppConfig {
    private final EmployeeRepository employeeRepository;

    public AppConfig(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Bean
    public EmployeeService employeeService() { 
        return new EmployeeServiceImpl(employeeRepository);
    }
}