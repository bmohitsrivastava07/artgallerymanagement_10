package com.ArtGalleryManagement.Backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ArtGalleryManagement.Backend.Models.ReviewRequest;
import com.ArtGalleryManagement.Backend.Service.ReviewService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	ReviewService reviewService;

	public ReviewController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	@GetMapping("/secure/user/product")
	public Boolean  reviewProductByUser(@RequestParam int productId) {
		String userEmail="mohit@gmail.com";
		return reviewService.userReviewListed(userEmail, productId);
	}
	@PostMapping("/secure")
	public void postReview(@RequestBody ReviewRequest reviewRequest) throws Exception{
		String userEmail="mohit@gmail.com";
		if(userEmail==null) {
			throw new Exception("user email doesn't not exist");
		}
		reviewService.postReview(userEmail, reviewRequest);
		
	}
	
	
	
	
}
