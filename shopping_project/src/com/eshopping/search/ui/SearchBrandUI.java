package com.eshopping.search.ui;

import com.eshopping.search.SearchEngine;
import com.eshopping.util.Utility;

public class SearchBrandUI {

	public  void searchBrands()
	{
		System.out.println("+================+");
		System.out.println("| Brands         |");
		System.out.println("+================+");
		System.out.println("| LG             |");
		System.out.println("| MI             |");
		System.out.println("| Haier          |");
		System.out.println("| Peter england  |");
		System.out.println("| Arrows         |");
		System.out.println("| Samsung        |");
		System.out.println("| Lava           |");
		System.out.println("| Nokia...etc    |");
		System.out.println("+================+");
		System.out.print("Enter:");
		SearchEngine.getInstance().getBrandProduct(Utility.in.next());
		
	}
	
}
