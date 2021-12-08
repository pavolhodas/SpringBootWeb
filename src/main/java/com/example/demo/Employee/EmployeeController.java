package com.example.demo.Employee;

import com.example.demo.Employee.Model.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    EmployeeService employeeService;
    DependencyInjectionDemo demo = new DependencyInjectionDemo(new EmployeeServiceImpl());

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/hello")
    public String helloMethod(){

        return "Hello Spring Boot";
    }

    @GetMapping("/sum")
    public double sumOfSallaryBonus(){
        return demo.employeeService.getSum(demo.employees);
    }

    @GetMapping("/num")
    public int writeNum(){
        return demo.employeeService.writeNumber();
    }
}
