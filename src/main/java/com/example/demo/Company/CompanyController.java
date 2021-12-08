package com.example.demo.Company;

import com.example.demo.Company.Model.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/company")
    public String writeSavedCompany(){
        Company company = new Company();
        company.setName("majo");

        companyService.saveCompany(company);
        return company.getName();
    }
}
