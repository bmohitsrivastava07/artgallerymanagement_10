package com.ArtGalleryManagement.Backend.Service;

import com.ArtGalleryManagement.Backend.Entity.Product;

public interface ProductService {

	public Product checkoutProduct(String userEmail,int productId) throws Exception;
	public Boolean checkoutProductByUser(String userEmail,int productId)throws Exception;
	public int currentLoans(String userEmail);
}
