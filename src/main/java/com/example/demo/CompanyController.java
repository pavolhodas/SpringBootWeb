package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    Company company = new Company(1, "Palo");

    @GetMapping("/company")
    public String writeSavedCompany(){

        companyService.saveCompany(company);
        return company.getName();
    }
}
