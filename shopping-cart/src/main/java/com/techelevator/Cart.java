package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> productList = new ArrayList<>();

	public List<Product> getProductList() {
		return productList;
	}

	public void addProduct(Product product) {
		if(productList.isEmpty()) {
			productList.add(product);
		} else {
			boolean shoot = true;
			for(Product p : productList) {
				if(p.getName().equals(product.getName())) {
					p.setQuantity(p.getQuantity()+product.getQuantity());
					shoot = false;
				} 
			}
			if(shoot) {
				productList.add(product);
			}
		}
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
