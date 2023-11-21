package br.com.jobseekers.jobapi.company.impl;

import java.util.List;
import java.util.Optional;

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

    @Override
    public boolean updateCompany(Company company, Long id) {
        Optional<Company> companyOptional = companyRepository.findById(id);
        if (companyOptional.isPresent()) {
            Company updateCompany = companyOptional.get();
            updateCompany.setName(company.getName());
            updateCompany.setDescription(company.getDescription());
            updateCompany.setJobs(company.getJobs());
            companyRepository.save(updateCompany);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public boolean deleteCompanyById(Long id) {
        if (companyRepository.existsById(id)) {
            companyRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
