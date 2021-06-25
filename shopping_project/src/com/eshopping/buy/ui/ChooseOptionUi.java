package com.eshopping.buy.ui;

import com.eshopping.order.OrderManager;
import com.eshopping.product.Product;
import com.eshopping.util.Utility;
import com.eshopping.cart.CartManager;

public class ChooseOptionUi {
	
	public void userOperation(Product p) {	
		
		String command =" ";		
		do {
	   		System.out.println("+=======================================================================================================+");
		   	System.out.println("|------------|1.Buy|--------|2.Add to Cart|----|3.Back|-------------------------------------------------|");
		   	System.out.println("+=======================================================================================================+");
	   		System.out.print("Enter :");
	   		command= Utility.in.next();
		  
	   		switch(command)
		   	{
		   		case "1" :
		   			OrderManager.getInstance().buyProduct(p);
		   			command="3";
		   			break;
		   		case "2" : 
		   			if(CartManager.getInstance().addCart(p))
		   			{
		   				System.out.println("Already In Cart");
		   				userOperation(p);
		   				
		   			}
		   			System.out.println("[ Item added to cart Successfully ]");
		   			command="3";
		   			break;
		   		case "3" :
		   			System.out.println("Back <== ");
		   			break;
		   		default :
		   			System.out.println("Incorrect Operation");
		   	}
	   	
	   	}while(!command.equals("3"));
	}
}
