package com.example.demo.Employee;

import com.example.demo.Adrdess.Address;
import com.example.demo.Company.Company;
import com.example.demo.Company.Model.CompanyService;
import com.example.demo.Course.Course;
import com.example.demo.Course.Model.CourseService;
import com.example.demo.Employee.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    CourseService courseService;

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
        Date d1 = new Date(2000, 11, 21);
        Date d2 = new Date();
        Course course1 = new Course("Introducing to java", d1, d2);
        Course course2 = new Course("Introducing to database", d1, d2);

        List<Course> courses = Arrays.asList(course1, course2);

        employee.setCourses(courses);
        employeeService.saveEmployee(employee);
        courseService.saveCourse(course1);
    }

    @PostMapping("/addEmp")
    public void addEmp( @RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }
}
