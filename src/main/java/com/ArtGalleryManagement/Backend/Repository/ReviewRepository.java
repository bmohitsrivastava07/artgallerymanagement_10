package com.ArtGalleryManagement.Backend.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;


import com.ArtGalleryManagement.Backend.Entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer>{
    Page<Review> findByProductId(@RequestParam("productId") int productId,Pageable pageable);
    Review findByUserEmailAndProductId(String userEmail,int productId);
}
