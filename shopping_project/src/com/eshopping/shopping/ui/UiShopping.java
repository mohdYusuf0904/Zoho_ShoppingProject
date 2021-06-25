package com.eshopping.shopping.ui;
import com.eshopping.search.SearchEngine;
import com.eshopping.util.Utility;

public class UiShopping {
	
	public void shopCommand() {
		
		System.out.println("--------------------------------------------------E-Shopping Cart-------------------------------------------------");
		String command=" ";
		do {
				System.out.println("+------------------------+");
				System.out.println("| 1.Search All           |");
				System.out.println("| 2.Catagories Search    |");
				System.out.println("| 3.Menu                 |");
				System.out.println("| 4.Log Out              |");
				System.out.println("+===================+====+===============+============================+=========================+");
				System.out.println("| Electronics       |      Mens          |           Women            |         Kids            |");
				System.out.println("|===================|====================|============================|=========================|");
				System.out.println("| *Mobile           |      *clothes      |    *clothes                |       *b1.Kids Clothes  |");
				System.out.println("| *Televisions      |      *Footwear     |    *footwears              |       *b2.footwears     |");
				System.out.println("| *Fridge           |                    |                            |                         |");
				System.out.println("| *Washing machine  |                    |                            |                         |");
				System.out.println("| *Laptaps          |                    |                            |                         | "); 
				System.out.println("+===================+====================+============================+=========================+");
				
				System.out.print("Enter :");
				command = Utility.in.next();
				
				switch(command)
				{
					case "1":
						SearchEngine.getInstance().searchAll();
						break;
					case "2":
						SearchEngine.getInstance().catagorySearch();
						break;
					case "3":
						SearchEngine.getInstance().getMenu();
						break;
					case "4":
						System.out.println("log out <===");
						break;
					default:
						System.out.println("Wrong operation");
						break;
				}
		
		}while(!command.equals("4"));

	}

}
