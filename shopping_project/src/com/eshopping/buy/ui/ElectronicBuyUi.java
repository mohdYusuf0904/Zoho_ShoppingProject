package com.eshopping.buy.ui;
import com.eshopping.buy.BuyProduct;
import com.eshopping.product.ElectronicProduct;
import com.eshopping.product.Product;


public class ElectronicBuyUi {

	public void buyPage(ElectronicProduct p) {
		
		
		System.out.println("========================================================================================================");
		System.out.println("----------------------------------------E-Shopping Cart--------------------------------------------------");
		System.out.println("========================================================================================================"); 
		System.out.println("+=======================================================================================================+");
	  	System.out.println("|                       Product Details                                                                 |");
	   	System.out.println("+======================================================================================================+");
		System.out.println("| Name        : "+ p.getName()) ;
	   	System.out.println("| Price       : "+ p.getPrice());
	   	System.out.println("| Description : "+ p.getDescription());
	   	System.out.println("| Brand       : " + p.getBrand());
	   	System.out.println("+========================================================================================================");
	   	System.out.println("|=======================Additional Details===============================================================");
	   	System.out.println("|"+p.getAdditionalDetails());
		System.out.println("|=======================Package Details===================================================================");
	   	System.out.println("|Package in Box      : " + p.getBoxDetails());
		System.out.println("|=======================Warranty Details==================================================================");
	   	System.out.println("|"+p.getWarrantyDetails());
	   	System.out.println("+=========================================================================================================+");
	   	
	   	BuyProduct.getInstance().clickOption((Product)p);
	 
	}

	
	
	

}
