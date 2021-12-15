package com.example.demo.Adrdess;

import com.example.demo.Adrdess.Model.AddressRepository;
import com.example.demo.Adrdess.Model.AddressService;
import com.example.demo.Company.Company;
import com.example.demo.Company.Model.CompanyRepository;
import com.example.demo.Company.Model.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService, CompanyService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public void saveAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public void saveCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public Address addAddress(Address address) {
        addressRepository.save(address);
        return address;
    }

    @Override
    public Company addCompany(Company company) {
        companyRepository.save(company);
        return company;
    }

}
