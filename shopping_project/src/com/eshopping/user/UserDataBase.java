package com.eshopping.user;

import java.util.ArrayList;
import java.util.List;

public class UserDataBase {

	
	private final static List<User> usersList = new ArrayList<>();
	
	public List<User> getUser(){
		return usersList;
	}

	public void addUser(User u) {
	
		usersList.add(u);
	}
	
}
