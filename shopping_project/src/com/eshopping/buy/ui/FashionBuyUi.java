package com.eshopping.buy.ui;

import com.eshopping.buy.BuyProduct;
import com.eshopping.product.FashionProduct;
import com.eshopping.product.Product;


public class FashionBuyUi {

	public void buyPage(FashionProduct p) {
		
		System.out.println("========================================================================================================");
		System.out.println("----------------------------------------E-Shopping Cart--------------------------------------------------");
		System.out.println("========================================================================================================"); 
		System.out.println();
		System.out.println("+=========================================================================================================+");
	  	System.out.println("|                 Product Details                                                                         |");
	   	System.out.println("+=========================================================================================================+");
		System.out.println("| Name        : "+ p.getName()) ;
	   	System.out.println("| Price       : "+ p.getPrice());
	   	System.out.println("| Description : "+ p.getDescription());
	   	System.out.println("| Brand       : " + p.getBrand());
	   	System.out.println("| Color       : " + p.getColour());
	   	System.out.println("| Catagory    : "+ p.getCatagory());
	   	System.out.println("+==========================================================================================================+");
	   
	   	BuyProduct.getInstance().clickOption((Product)p);
	 	
	}
}