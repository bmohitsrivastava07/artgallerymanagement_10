package com.ArtGalleryManagement.Backend.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ArtGalleryManagement.Backend.Entity.CheckOut;
import com.ArtGalleryManagement.Backend.Entity.Product;
import com.ArtGalleryManagement.Backend.Repository.CheckOutRepository;
import com.ArtGalleryManagement.Backend.Repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl  implements ProductService{

	@Autowired
	ProductRepository productRepository;
	@Autowired
	 CheckOutRepository checkoutRepository;
	
	
	public ProductServiceImpl(ProductRepository productRepository, CheckOutRepository checkoutRespository) {
		super();
		this.productRepository = productRepository;
		this.checkoutRepository = checkoutRespository;
	}


	@Override
	public Product checkoutProduct(String userEmail, int productId)throws Exception{
         Optional<Product> product = productRepository.findById(productId);
          CheckOut validatecheckOut = checkoutRepository.findByUserEmailAndProductId(userEmail, productId);
          if(!product.isPresent()||validatecheckOut!=null || product.get().getProductQuantityAvailable()<=0) {
        	  throw new Exception("Product doesn't exist or already user checkout the product");
          }
          product.get().setProductQuantityAvailable(product.get().getProductQuantityAvailable()-1);
          productRepository.save(product.get());
          CheckOut checkout=new CheckOut(
        		  userEmail,
        		  LocalDate.now().toString(),
        		  product.get().getProductId()        		  
        		  );
          checkoutRepository.save(checkout);
        		  return product.get();
	}
	
	@Override
	public Boolean checkoutProductByUser(String userEmail,int productId) throws Exception{
		CheckOut validatecheckOut = checkoutRepository.findByUserEmailAndProductId(userEmail, productId);
		if(validatecheckOut==null) {
			return false;
		}
			return true;
	}


	@Override
	public int currentLoans(String userEmail) {
        
		List<CheckOut> count=checkoutRepository.findProductByUserEmail(userEmail);
		return count.size();
	}

}
