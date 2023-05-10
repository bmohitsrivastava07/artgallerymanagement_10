package com.ArtGalleryManagement.Backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ArtGalleryManagement.Backend.Entity.Product;
import com.ArtGalleryManagement.Backend.Service.ProductService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/product")
public class ProductController {
	@Autowired
     ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	@GetMapping("/secure/ischeckout/byuser")
	public Boolean checkoutProductByUser(@RequestParam int productId) throws Exception{
	    String userEmail="test@gamil.com";
	    return productService.checkoutProductByUser(userEmail, productId);
	}
	
	@GetMapping("/secure/currentloans")
	public int currentLoansCount() {
		String userEmail="mohit@gmail.com";
		return productService.currentLoans(userEmail);
	}
    
	@PutMapping("/secure/checkout")
	public Product checkoutProduct(@RequestParam int productId)throws Exception{
		String userEmail="ankita@gmail.com";
		return productService.checkoutProduct(userEmail, productId);
	}
	
	
	
    
    
}
