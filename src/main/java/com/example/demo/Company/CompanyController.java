package com.example.demo.Company;

import com.example.demo.Company.Model.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CompanyController {

    @Autowired
    CompanyService companyService;

    Company company = new Company( "Palo");

    @GetMapping("/company")
    public String saveCompany(){
        companyService.saveCompany(company);

        return company.getName();
    }
}
