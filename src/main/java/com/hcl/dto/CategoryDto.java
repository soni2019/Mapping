package com.hcl.dto;

import com.hcl.entity.Category;

public class CategoryDto {
	
	
	private int quantity;
	private double price;
	
	private long categoryId;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	/*
	 * private Long categoryId; private String categoryName; private Date
	 * lastUpdate; private Set<Product> products;
	 * 
	 * 
	 * 
	 * public Long getCategoryId() { return categoryId; } public void
	 * setCategoryId(Long categoryId) { this.categoryId = categoryId; } public
	 * String getCategoryName() { return categoryName; } public void
	 * setCategoryName(String categoryName) { this.categoryName = categoryName; }
	 * public Date getLastUpdate() { return lastUpdate; } public void
	 * setLastUpdate(Date lastUpdate) { this.lastUpdate = lastUpdate; } public
	 * Set<Product> getProducts() { return products; } public void
	 * setProducts(Set<Product> products) { this.products = products; }
	 */
	
	

}
