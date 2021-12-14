package com.example.demo.Adrdess;

import com.example.demo.Adrdess.Address;
import com.example.demo.Adrdess.Model.AddressService;
import com.example.demo.Company.Company;
import com.example.demo.Company.Model.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @Autowired
    CompanyService companyService;

//    @GetMapping("/address")
//    public String writeSavedController(){
//
//        Address address = new Address();
//
//
//        Company company = new Company();
//        company.setName("Lucia");
//        if(company.getName() != null) {
//            addressService.saveAddress(address);
//        }
//        if(address.getCity() != null) {
//            companyService.saveCompany(company);
//        }
//        return address.getCity();
//    }


    @PostMapping("/addressCompany")
    public String addCompanyWithAddress(){

        Address address = new Address();
        addressService.addAddress(address);


        return address.getCity();
    }
}
