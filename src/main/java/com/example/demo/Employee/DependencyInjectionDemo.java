package com.example.demo.Employee;
import com.example.demo.Employee.Model.Employee;
import com.example.demo.Employee.Model.EmployeeService;
import com.example.demo.Employee.Model.Programmer;
import com.example.demo.Employee.Model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
