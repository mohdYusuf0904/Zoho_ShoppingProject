package com.eshopping.product;

import java.util.ArrayList;
import java.util.List;

public class ProductsDataBase {

	private static List<Product> productList = new ArrayList<>();

	public void StoreProducts(Product p) {
		productList.add(p);
	}

	public List<Product> getProduct() {

		return productList;
	}

	public void removeProduct(Product p) {

		productList.remove(p);
	}

	public void removeAll(List<Product> list) {
		productList.removeAll(list);
		
	}
	
	
}
