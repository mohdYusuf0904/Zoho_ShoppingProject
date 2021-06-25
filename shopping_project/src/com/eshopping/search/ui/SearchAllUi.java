package com.eshopping.search.ui;
import com.eshopping.search.SearchEngine;
import com.eshopping.util.Utility;

public class SearchAllUi {

	public void searchAll() {
		
		System.out.println("+=====================+");
		System.out.println("| Products            |");
		System.out.println("+=====================+");
		System.out.println("| Electronics         |");
		System.out.println("|---------------------|");
		System.out.println("| Clothes             |");
		System.out.println("|---------------------|");
		System.out.println("| Footwear            |");
		System.out.println("+=====================+");
		System.out.println();
		System.out.print("Enter:");
		Utility.in.nextLine();
		SearchEngine.getInstance().getProduct(Utility.in.nextLine());
	}
}

