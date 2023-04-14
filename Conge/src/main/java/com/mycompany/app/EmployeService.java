package com.mycompany.app;

import com.mycompany.app.EmployeRepository;
import com.mycompany.app.RequestRegistrationEmploye;
import com.mycompany.app.Employee;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
@Service
public class EmployeService{
       private final EmployeRepository employeRepository;
       public EmployeService(EmployeRepository employeRepository){
           this.employeRepository = employeRepository;
       }
       public void registerEmploye(RequestRegistrationEmploye request){
          Employee employee = Employee.builder()
               .firstName(request.firstName())
               .lastName(request.lastName())
               .adresse(request.adresse())
               .email(request.email())
               .build();
          employeRepository.save(employee);

}
}
