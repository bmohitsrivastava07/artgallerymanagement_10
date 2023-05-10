package com.ArtGalleryManagement.Backend.Entity;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="checkout")
@Data
public class CheckOut {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int checkout_id;
	
	@Column(name="user_email")
	private String userEmail;
	
	@Column	
	private String checkout_date;
	
	@Column(name="product_id")
	private int productId;
	
	public CheckOut() {	}

	public CheckOut(String userEmail, String checkout_date, int productId) {
		this.userEmail = userEmail;
		this.checkout_date = checkout_date;
		this.productId = productId;
	}
	
	
	
	

	
}
