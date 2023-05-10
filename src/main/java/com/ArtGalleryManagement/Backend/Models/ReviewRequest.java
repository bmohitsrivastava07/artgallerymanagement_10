package com.ArtGalleryManagement.Backend.Models;

import java.util.Optional;

import lombok.Data;

@Data
public class ReviewRequest {
private int productId;
   private double rating;
   private Optional<String> review_description;
   
   public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Optional<String> getReview_description() {
		return review_description;
	}
	public void setReview_description(Optional<String> review_description) {
		this.review_description = review_description;
	}
}
