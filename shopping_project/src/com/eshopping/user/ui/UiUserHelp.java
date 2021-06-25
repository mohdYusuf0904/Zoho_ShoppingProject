package com.eshopping.user.ui;

import com.eshopping.user.User;
import com.eshopping.user.UserManager;
import com.eshopping.util.Utility;

public class UiUserHelp {

	
	public void changePassword() {
		
		String email,phoneNum;
		
		System.out.println("Enter a email-id");
		email=Utility.in.next();
		
		System.out.println("Enter a last 4 digit four number");
		phoneNum = Utility.in.next();
		
		User u =UserManager.getInstance().isUserValid(email,phoneNum);
		if( u!=null) {	
			
			UserManager.getInstance().setPassword(u);
			System.out.println("\n Password changed.");
			
		}else {
			
			System.out.println("Wrong details no user found!");
		}
		
	}


}
