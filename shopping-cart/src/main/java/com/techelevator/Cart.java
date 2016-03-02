package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> productList = new ArrayList<>();
	
	public List<Product> getProductList() {
		return productList;
	}

	public void addProduct(Product product) {
		productList.add(product);
	}
	
	public Integer getTotalValue() {
		Integer totalValue = 0;
		for(Product product : productList) {
			Integer quantity = product.getQuantity();
			Integer price = Integer.parseInt(product.getPrice());
			totalValue += quantity * price;
		}
		return totalValue;
	}
	

}
