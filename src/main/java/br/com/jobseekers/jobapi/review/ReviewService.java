package br.com.jobseekers.jobapi.review;

import java.util.List;

public interface ReviewService {
    
    List<Review> getAllReviews(Long companyId);
    boolean addReview(Long companyId, Review review);
    Review getReview(Long companyId, Long reviewId);
    Review updateReview(Long companyId, Long reviewId, Review review);
    Review deleteReview(Long companyId, Long reviewId);
}
