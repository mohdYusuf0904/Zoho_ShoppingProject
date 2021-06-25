package com.eshopping.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.eshopping.user.User;

public class OrderDB {
	
	private Map<User,List<Order>> userOrders;
	private List<Order> productList;
	
	public OrderDB()
	{
		userOrders = new HashMap<>();
		productList = new ArrayList<>();
	}
	
	public void addMyOrder(User user, Order order) {
	
		productList.add(order);
		userOrders.put(user,productList);	
	}

	public List<Order> getMyOrder(User u){
		return userOrders.get(u);
	}
}
