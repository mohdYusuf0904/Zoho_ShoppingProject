package com.eshopping.search.ui;

import com.eshopping.search.SearchEngine;
import com.eshopping.util.Utility;

public class SearchUi {

	public  void catagorySearch() {
		
		String command=" ";

		do{
			
			System.out.println("+----------------------+");
			System.out.println("| Search Operations    |");
			System.out.println("+----------------------+");
			System.out.println("| 1.Show All           |");
			System.out.println("| 2.Search by brands   |");
			System.out.println("| 3.Fashions           |");
			System.out.println("| 4.Back               |");
			System.out.println("+----------------------+");

			System.out.print("Enter : ");
			command = Utility.in.next();
			
			switch(command)
			{
			
				case "1": 
					SearchEngine.getInstance().productsList();
					break;
				case "2":
					SearchEngine.getInstance().searchBrands();
					break;
				case "3":
					SearchEngine.getInstance().searchFashions();
					break;
				case "4":
					System.out.println("back <--");
					break;
				default:
					System.out.println("Wrong command!!");
					
			}
			
		}while(!command.equals("4"));
	
	}
	
}
