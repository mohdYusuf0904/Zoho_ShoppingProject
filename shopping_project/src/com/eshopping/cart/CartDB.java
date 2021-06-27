package com.eshopping.cart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eshopping.product.Product;
import com.eshopping.user.User;

public class CartDB {

	private Map<User,List<Product>> userCarts;

	public CartDB()
	{
		userCarts = new HashMap<>();
	}
	
	public void addCart(User user, Product p) {
	
		userCarts.putIfAbsent(user, new ArrayList<>());
		userCarts.get(user).add(p);	
	}

	public List<Product> getCart(User u){
		return userCarts.get(u);
	}

	public void removeInCart(User u,Product removeProduct) {
	
		for (Map.Entry<User, List<Product>> entry : userCarts.entrySet()) {
            
			   if(entry.getValue().contains(removeProduct))
			   {
				   entry.getValue().remove(removeProduct);
			   }
			   
		   }
		
	
	}

	
	public boolean isNull(User u) {
		
		if(userCarts.get(u)==null)
		{
			return true;
		}
		
		return false;
	}

	public void cartClear(User u ,List<Product> list) {
		
		userCarts.get(u).clear();
		
	}
}
