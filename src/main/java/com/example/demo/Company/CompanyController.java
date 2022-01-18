package com.example.demo.Company;

import com.example.demo.Adrdess.Address;
import com.example.demo.Adrdess.Model.AddressService;
import com.example.demo.Company.Model.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.OneToOne;

@RestController
@RequestMapping
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @Autowired
    AddressService addressService;

    //6. exercise, one to one
    @GetMapping("/address")
    public String writeSavedController(){
        Address address = new Address("poluvsie 190", "234", "zilina", "Slovensko" );
        Company company = new Company("Jozo", address);

        addressService.saveAddress(company.getAddress());
        companyService.saveCompany(company);


        return String.valueOf(company.getAddress());
    }

    //7. exercise
    @PostMapping("/addCompany")
    public void addCompany(@RequestBody Company company){
        companyService.saveCompany(company);
        addressService.saveAddress(company.getAddress());
    }
}
