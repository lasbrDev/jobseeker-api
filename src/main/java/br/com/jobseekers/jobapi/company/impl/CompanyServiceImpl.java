package br.com.jobseekers.jobapi.company.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.jobseekers.jobapi.company.Company;
import br.com.jobseekers.jobapi.company.CompanyRepository;
import br.com.jobseekers.jobapi.company.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
