package com.eshopping.cart.ui;

import java.util.List;

import com.eshopping.cart.CartManager;
import com.eshopping.order.OrderManager;
import com.eshopping.product.Product;
import com.eshopping.util.Utility;

public class MyCartUi {

	
	public void myCart(List<Product> productList) {
		
		
		if(productList==null || productList.isEmpty())
		{
			System.out.println("[ Cart Is Empty ]");
			System.out.println("3.Back");
			return;
		}

		double totalPrice=0;
		for(Product p:productList) {	  
			
			System.out.println("+----+--------------+----------------------------------------+----------------------------------------------------------------------------------------------------------------------------------+");	
			System.out.println("id : "+(productList.indexOf(p)+1)+"\n"+ "Name : " +  p.getName()+"\nProduct Details : "+p.getDescription()+"\nPrice :  "+ p.getPrice());
			System.out.println("+----+--------------+----------------------------------------+-------------------------------------------------------------------------------------------------------------------------------+");	
			
			totalPrice+=p.getPrice();
			
		}
		System.out.println();
		System.out.println("+=========================================================================================================================================================================================================");
		System.out.println("| Price ("+productList.size()+" items )       : "+totalPrice);
		System.out.println("| Delivery Charges                            : Free"      );
		System.out.println("| GST                                         : 5%");
		System.out.println("| Total Price                                 : "+(totalPrice + ((totalPrice*5)/100)));
		System.out.println("+=========[1.Remove]=====[2.Continue]====[3.Back]=================================================================================================================================================================");

			
			String command="";
			do {
				System.out.print("Enter :");
				command = Utility.in.next();
				
				switch(command)
				{
					case "1":
						CartManager.getInstance().cartRemove(userSearch(productList.size()));
						myCart(productList);
						break;
					case "2":
						OrderManager.getInstance().buyCartProducts(productList);
						command="3";
						break;
					case "3":
						System.out.println("Back <==");
						break;
				}
				
			}while(!command.equals("3"));
		
		
	}
	
	private int userSearch(int size) {
		
		int command=0;
		System.out.print("Enter id to remove :");
		command=Utility.in.nextInt();
		
		while(command<=0 || command>size)
		{
			
			System.out.println();
			System.out.print("Enter again:");
			command=Utility.in.nextInt();
		
		}
		
		return (command-1);
	}
	
}
