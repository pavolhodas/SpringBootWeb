package com.example.demo.Employee;

import com.example.demo.Adrdess.Address;
import com.example.demo.Company.Company;
import com.example.demo.Employee.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
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

    @GetMapping("/saveEmp")
    public void saveEmp(){
        Employee employee = new Programmer( 2000, 50);
        employee.setCompanyId(177L);
        employeeService.saveEmployee(employee);
    }

    @PostMapping("/addEmp")
    public void addEmp( @RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }
}
