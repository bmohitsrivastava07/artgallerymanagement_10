package com.ArtGalleryManagement.Backend.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.ArtGalleryManagement.Backend.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
   Page<Product> findByCategory(@RequestParam("category") String category,Pageable pageable);
   Page<Product> findByTitle(@RequestParam("title") String title,Pageable pageable);
}
