package com.ArtGalleryManagement.Backend.Entity;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name = "reviews")
@Data
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int review_id;
	@Column(name="user_email")
	private String userEmail;
	@Column
	@CreationTimestamp
	private Date date;
	@Column
	private double rating;
	@Column(name="product_id")
	private int productId;
	@Column
	private String review_description;
	public int getReview_id() {
		return review_id;
	}
	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getReview_description() {
		return review_description;
	}
	public void setReview_description(String review_description) {
		this.review_description = review_description;
	}
	
	
}
