package com.eshopping.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.eshopping.user.User;

public class OrderDB {
	
	private Map<User,List<Order>> userOrders;

	
	public OrderDB()
	{
		userOrders = new HashMap<>();
		
	}
	
	public void addMyOrder(User user, Order order) {
	
		userOrders.putIfAbsent(user, new ArrayList<>());
		
		userOrders.get(user).add(order);
	}

	public List<Order> getMyOrder(User u){
		return userOrders.get(u);
	}
}
