package com.ArtGalleryManagement.Backend.Service;

import com.ArtGalleryManagement.Backend.Entity.Review;
import com.ArtGalleryManagement.Backend.Models.ReviewRequest;

public interface ReviewService {

	public void postReview(String userEmail,ReviewRequest reviewRequest) throws Exception;
	public Boolean  userReviewListed(String userEmail,int productId);
}
