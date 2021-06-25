package com.eshopping.order.ui;

import java.util.List;

import com.eshopping.order.Order;
import com.eshopping.order.OrderManager;
import com.eshopping.util.Utility;


public class OrderListUi {

	public void orderLists(List<Order> orderList)
	{
		
		if(orderList==null)
		{
			System.out.println("[ Order Is Empty ]");
			return;
		}
		
			for(Order order : orderList) {	  
				
				System.out.println("+----+--------------+----------------------------------------+------------------------------------------------------------------------------------------------------+");	
				System.out.println("| [ Date : "+ order.getDate()+"] \n"+"| id : "+(orderList.indexOf(order)+1)+"\n"+ "| Name : " +  order.getProduct().getName()+"\n| Product Details : "+order.getProduct().getDescription()+"\n| Price :  "+ order.getProduct().getPrice());
				System.out.println("+----+--------------+----------------------------------------+------------------------------------------------------------------------------------------------------+");	
			}
			
			userCommand(userSearch(orderList.size()));
			
	}
	
	private int userSearch(int size) {
		
		int command=0;
		System.out.print("Enter :");
		command=Utility.in.nextInt();
		
		while(command<=0 || command>size)
		{
			
			System.out.println();
			System.out.print("Enter again:");
			command=Utility.in.nextInt();
		
		}
		
		return (command-1);
	}
	
	private void userCommand(int id) {
		String command=" ";
		do {

			System.out.println("+===========================+");
			System.out.println("| 1. Invoice Details        |");
			System.out.println("| 2. Buy Again              |");
			System.out.println("| 3. Back                   |");
			System.out.println("+===========================+");
			System.out.println("Enter :");
		  command = Utility.in.next();
		  switch(command)
		  {
			case "1":
				OrderManager.getInstance().printInvoice(id);
				break;
			case "2":
				if(!OrderManager.getInstance().orderAgain(id)) {
					System.out.println("Out Of Stock");
				}
				break;
			case "3":
				System.out.println("Back <===");
				break;
				
			 default:
				 System.out.println("Wrong Operation");
		  }
		}while(!command.equals("3"));
		
	}
	
}
