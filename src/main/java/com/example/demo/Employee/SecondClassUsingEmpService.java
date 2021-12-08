package com.example.demo.Employee;
import com.example.demo.Employee.Model.EmployeeService;
import org.springframework.stereotype.Component;

@Component
public class SecondClassUsingEmpService {
    EmployeeService employeeService;


    public SecondClassUsingEmpService(EmployeeService employeeService) {
        this.employeeService = employeeService;
        this.employeeService.writeNumber();
    }
}
