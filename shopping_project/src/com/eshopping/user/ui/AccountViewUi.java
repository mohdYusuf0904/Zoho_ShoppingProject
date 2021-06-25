package com.eshopping.user.ui;

import com.eshopping.user.User;
import com.eshopping.util.Utility;

public class AccountViewUi {

	
	public void accountDetails(User user) {
		
		System.out.println("+=======================================================================================================");
		System.out.println("|---------------------------------------E-Shopping Cart--------------------------------------------------");
		System.out.println("+=========================================================================================================+");
	  	System.out.println("|                 User Details                                                                         |");
	   	System.out.println("+=========================================================================================================+");
		System.out.println("| Name        : "+ user.getName()) ;
	   	System.out.println("| Price       : "+ user.getPhone());
	   	System.out.println("| Email id    : "+ user.getEmail());
	   	System.out.println("+==============[2.Back]=========================================================================================+");
	
	   	System.out.print("Enter:");
	   	while(!Utility.in.next().equals("2")) {
			System.out.println("Wrong command");
		}
		
	}
	
	
}
