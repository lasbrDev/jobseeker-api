package br.com.jobseekers.jobapi.review.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.jobseekers.jobapi.review.Review;
import br.com.jobseekers.jobapi.review.ReviewRepository;
import br.com.jobseekers.jobapi.review.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        List<Review> reviews = reviewRepository.findAllByCompanyId(companyId);
        return reviews;
    }
}
