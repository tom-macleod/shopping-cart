package com.techelevator;

public abstract class Product {
	
	private String name;
	private String price;
	private Integer quantity;
	
	public Product(String name, String price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

}
