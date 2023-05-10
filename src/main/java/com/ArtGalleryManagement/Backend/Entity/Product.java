package com.ArtGalleryManagement.Backend.Entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
    private int productId;
	@Column(name="product_title")
    private String title;
	@Column(name="artist")
    private String artist;
    @Column(name="product_description")
    private String productDescription;
    @Column(name="product_quantity")
    private int productQuantity;
    @Column(name="product_quantity_available")
    private int productQuantityAvailable;
    @Column
    private String category;
    @Column(name="product_image")
    private String productImage;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String product_title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public int getProductQuantityAvailable() {
		return productQuantityAvailable;
	}
	public void setProductQuantityAvailable(int productQuantityAvailable) {
		this.productQuantityAvailable = productQuantityAvailable;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
    
	
    
}
