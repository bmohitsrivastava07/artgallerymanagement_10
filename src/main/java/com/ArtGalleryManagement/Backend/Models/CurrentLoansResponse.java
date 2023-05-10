package com.ArtGalleryManagement.Backend.Models;

import com.ArtGalleryManagement.Backend.Entity.Product;

import lombok.Data;

@Data
public class CurrentLoansResponse {

	private int daysLeft;
	private Product product;
	public CurrentLoansResponse(int daysLeft, Product product) {
		super();
		this.daysLeft = daysLeft;
		this.product = product;
	}
	
	
}
