package com.example.demo.Adrdess;

import com.example.demo.Adrdess.Model.AddressService;
import com.example.demo.Company.Company;
import com.example.demo.Company.Model.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AddressController {

    @Autowired
    AddressService addressService;

    @Autowired
    CompanyService companyService;

    //5. fifth exercise
    @GetMapping("/address")
    public String writeSavedController(){

        Address address = new Address();
        address.setZipCode("234");

        Company company = new Company();
        company.setName("Lucia");
        if(company.getName() != null) {
            addressService.saveAddress(address);
        }
        if(address.getCity() != null) {
            companyService.saveCompany(company);
        }
        return address.getCity();
    }

    //6. sixth exercise
    @PostMapping("/addAddressCompany")
    public Address addCompany(@RequestBody Address newCompanyWithAddress) {
        companyService.addCompany(newCompanyWithAddress);
        return newCompanyWithAddress;
    }

    @PostMapping("/addAddress")
    public Address addAddress(@RequestBody Address newAddress){
        return  addressService.addAddress(newAddress);
    }

    @PostMapping("/addCompany")
    public Company addCompany(@RequestBody Company newCompany){
        return  companyService.addCompany(newCompany);
    }

}
