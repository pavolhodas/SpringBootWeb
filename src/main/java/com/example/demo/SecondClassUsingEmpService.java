package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class SecondClassUsingEmpService {
    EmployeeService employeeService;


    public SecondClassUsingEmpService(EmployeeService employeeService) {
        this.employeeService = employeeService;
        this.employeeService.writeNumber();
    }
}
