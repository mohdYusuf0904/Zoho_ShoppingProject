package com.eshopping.search.ui;

import com.eshopping.cart.CartManager;
import com.eshopping.order.OrderManager;
import com.eshopping.user.UserManager;
import com.eshopping.util.Utility;

public class UIMenu {

	public void userMenu() {
		
		String command="";
		do {
			System.out.println("+=======Menu========+");
			System.out.println("| 1.Account Details |");
			System.out.println("| 2.Cart            |");
			System.out.println("| 3.My Orders       |");
			System.out.println("| 4.Back            |");
			System.out.println("+===================+");
			System.out.print("Enter : ");
			command = Utility.in.next();
			System.out.println();
			switch(command)
			{
				case "1":
					UserManager.getInstance().printUserDeatils();
					break;
				case "2":
					CartManager.getInstance().printCartDetails();
					break;
				case "3":
					OrderManager.getInstance().printOrdersDetails();
			}
			
			
		}while(!command.equals("4"));
		
		
		
	}
	
}
