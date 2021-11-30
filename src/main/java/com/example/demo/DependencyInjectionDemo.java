package com.example.demo;
import com.example.demo.Model.Employee;
import com.example.demo.Model.Programmer;
import com.example.demo.Model.Teacher;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class DependencyInjectionDemo {
    EmployeeService employeeService;

    ArrayList<Employee> employees = new ArrayList(Arrays.asList(new Programmer(100, 1100), new Teacher(150, 2560)));

    public void addEmployees(ArrayList<Employee> employees){
        employees.add(new Programmer(100, 1100));
        employees.add(new Teacher(150, 2560));
    }

    public DependencyInjectionDemo(EmployeeService employeeService) {
        this.employeeService = employeeService;
        this.addEmployees(employees);
        this.employeeService.getSum(employees);
        this.employeeService.writeNumber();

    }
}
