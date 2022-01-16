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
        addressService.saveAddress(address);

        Company company = new Company("Jozo", address);
        companyService.saveCompany(company);

        return String.valueOf(company.getAddress());
    }
}
