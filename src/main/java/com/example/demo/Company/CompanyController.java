package com.example.demo.Company;

import com.example.demo.Adrdess.Address;
import com.example.demo.Adrdess.Model.AddressService;
import com.example.demo.Company.Model.CompanyService;
import com.example.demo.Course.Model.CourseService;
import com.example.demo.Employee.Employee;
import com.example.demo.Employee.Model.EmployeeService;
import com.example.demo.Employee.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.OneToOne;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @Autowired
    AddressService addressService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    CourseService courseService;

    //6. exercise, one to one
    @GetMapping("/address")
    public String writeSavedController(){
        Address address = new Address("poluvsie 190", "234", "zilina", "Slovensko" );

        Employee employee = new Programmer(1500, 200);
        Employee employee2 = new Programmer(1400, 300);
        Employee employee3 = new Programmer(1500, 300);
        List<Employee> employees = Arrays.asList(employee, employee2, employee3);

        Company company = new Company("Jozo", address, employees );
        addressService.saveAddress(company.getAddress());
        companyService.saveCompany(company);
        //employeeService.saveEmployee(company.getEmployeeList().get(0));



        return String.valueOf(company.getAddress());
    }

    //7. exercise
    @PostMapping("/addCompany")
    public void addCompany(@RequestBody Company company){
        companyService.saveCompany(company);
        addressService.saveAddress(company.getAddress());
    }
}
