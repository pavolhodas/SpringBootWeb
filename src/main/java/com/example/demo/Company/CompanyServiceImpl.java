package com.example.demo.Company;

import com.example.demo.Company.Model.CompanyRepository;
import com.example.demo.Company.Model.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public void saveCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public Company addCompany(Company company) {
        companyRepository.save(company);
        return company;
    }
}
