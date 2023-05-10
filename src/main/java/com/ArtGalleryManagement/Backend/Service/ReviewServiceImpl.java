package com.ArtGalleryManagement.Backend.Service;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ArtGalleryManagement.Backend.Entity.Review;
import com.ArtGalleryManagement.Backend.Models.ReviewRequest;
import com.ArtGalleryManagement.Backend.Repository.ProductRepository;
import com.ArtGalleryManagement.Backend.Repository.ReviewRepository;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	ReviewRepository reviewRepository;
	@Autowired
	ProductRepository productRepository;	
	
	public ReviewServiceImpl(ReviewRepository reviewRepository, ProductRepository productRepository) {
		super();
		this.reviewRepository = reviewRepository;
		this.productRepository = productRepository;
	}

	@Override
	public void postReview(String userEmail, ReviewRequest reviewRequest) throws Exception {
		 Review validateReview = reviewRepository.findByUserEmailAndProductId(userEmail, reviewRequest.getProductId());
		 if(validateReview!=null) {
			 throw new Exception("Review already exist");
		 }
		 Review review=new Review();
			/* review.setProductId(reviewRequest.getProductId()); */
		 review.setProductId(reviewRequest.getProductId());
		 review.setRating(reviewRequest.getRating());
		 review.setUserEmail(userEmail);
		 if(reviewRequest.getReview_description().isPresent()) {
			 review.setReview_description(reviewRequest.getReview_description().map(Object::toString).orElse(null));			 
		 }
		 review.setDate(Date.valueOf(LocalDate.now()));
		 reviewRepository.save(review);
	}

	@Override
	public Boolean userReviewListed(String userEmail, int productId) {
	    Review validateReview = reviewRepository.findByUserEmailAndProductId(userEmail, productId);
	    if(validateReview!=null) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}

}
