package com.eshopping.order.ui;

import com.eshopping.order.Order;
import com.eshopping.user.*;
import com.eshopping.util.Utility;
public class InvoiceUI {

	public void printInvoice(User user,Order order) {
			
											
		System.out.println("--------------------------------------[TAX INVOICE]----------------------------------------------------------");
		System.out.println("-------------------------------------------------[Invoice number : xxx1332323]--------------------------");
		System.out.println("Order Date   : "+order.getDate());
		System.out.println("Invoice Date : "+order.getDate());
		System.out.println("Bill to      : "+user.getName() + " \n             : " + user.getAddress());
		System.out.println("Ship to      : "+user.getName() + " \n             : " + user.getAddress());
		System.out.println("Total Items  :  1");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Product      : "+order.getProduct().getName());
		System.out.println("Title        : "+order.getProduct().getDescription());
		System.out.println("Qty          :  1");
		System.out.println("Gross amount : "+order.getProduct().getPrice());
		System.out.println("Gst          : "+((order.getProduct().getPrice()*5)/100));
		System.out.println("Total amount : "+(order.getProduct().getPrice()+(order.getProduct().getPrice()*5)/100));
		System.out.println();
		System.out.println("                Eshopping authorized signature :   Eshopping cart");
		System.out.println("------------------[2.back]----------------------------------------------------------------------------------------------------------");
		System.out.print("Enter :");
		while(!Utility.in.next().equals("2")) {

			System.out.println("Wrong command");
			System.out.print("Enter Again :");
			
		}
		
		System.out.println("back <==");
	}
	
}
