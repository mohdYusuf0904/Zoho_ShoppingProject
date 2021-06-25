package com.eshopping.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eshopping.product.Product;
import com.eshopping.user.User;

public class CartDB {

	private Map<User,List<Product>> userCarts;
	private List<Product> productList;
	
	public CartDB()
	{
		userCarts = new HashMap<>();
		productList = new ArrayList<>();
	}
	
	public void addCart(User user, Product p) {
	
		productList.add(p);
		userCarts.put(user,productList);	
	}

	public List<Product> getCart(User u){
		return userCarts.get(u);
	}

	public void removeInCart(Product removeProduct) {
		productList.remove(removeProduct);
		
	}

	public boolean isNull() {
		if(productList.isEmpty())
			return true;
			
			return false;
	}
}
