package br.com.jobseekers.jobapi.review;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewController {
    
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    
    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long companyId) {
        List<Review> reviews = reviewService.getAllReviews(companyId);
        return ResponseEntity.ok(reviews);
    }

    @PostMapping("/reviews")
    public ResponseEntity<Review> addReview(@PathVariable Long companyId, @RequestBody Review review) {

        boolean isRiviewAdded = reviewService.addReview(companyId, review);
        if (!isRiviewAdded) {
            return ResponseEntity.badRequest().build();
        } else {
            return ResponseEntity.ok(review);
        }
    }

    @GetMapping("/reviews/{reviewId}")
    public ResponseEntity<Review> getReview(@PathVariable Long companyId, @PathVariable Long reviewId) {
        return ResponseEntity.ok(reviewService.getReview(companyId, reviewId));
    }

    @PutMapping("/reviews/{reviewId}")
    public ResponseEntity<Review> updateReview(@PathVariable Long companyId, @PathVariable Long reviewId, @RequestBody Review review) {
        return ResponseEntity.ok(reviewService.updateReview(companyId, reviewId, review));
    }

    @DeleteMapping("/reviews/{reviewId}")
    public ResponseEntity<Review> deleteReview(@PathVariable Long companyId, @PathVariable Long reviewId) {
        return ResponseEntity.ok(reviewService.deleteReview(companyId, reviewId)) ;
    }
}

