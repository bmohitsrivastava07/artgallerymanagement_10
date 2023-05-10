package com.ArtGalleryManagement.Backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ArtGalleryManagement.Backend.Entity.CheckOut;

public interface CheckOutRepository extends JpaRepository<CheckOut, Long> {

	 CheckOut findByUserEmailAndProductId(String userEmail,int  ProductId);
	 List<CheckOut> findProductByUserEmail(String userEmail);
	
}
