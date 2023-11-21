package br.com.jobseekers.jobapi.review.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.jobseekers.jobapi.company.Company;
import br.com.jobseekers.jobapi.company.CompanyService;
import br.com.jobseekers.jobapi.review.Review;
import br.com.jobseekers.jobapi.review.ReviewRepository;
import br.com.jobseekers.jobapi.review.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final CompanyService companyService;

    public ReviewServiceImpl(ReviewRepository reviewRepository, CompanyService companyService) {
        this.reviewRepository = reviewRepository;
        this.companyService = companyService;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        List<Review> reviews = reviewRepository.findAllByCompanyId(companyId);
        return reviews;
    }

    @Override
    public boolean addReview(Long companyId, Review review) {
        Company company = companyService.getCompanyById(companyId);
        if (company != null) {
            review.setCompany(company);
            reviewRepository.save(review);
            return true;
        }
        return false;
    }
}
