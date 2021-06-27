package com.eshopping.search.ui;

import com.eshopping.search.SearchEngine;
import com.eshopping.util.Utility;

public class SearchBrandUI {

	public  void searchBrands()
	{
		System.out.println("+=============================================+");
		System.out.println("|               All Brands                    |");
		System.out.println("+================+===============+============+");
		System.out.println("| LG             |  Crocs        | Fabwomen   |");
		System.out.println("| MI             |  Puma         | Saraa      |");
		System.out.println("| Haier          |  Nike         | Johnplay   |");
		System.out.println("| Asus           |  Puma         | Netplay    |");
		System.out.println("| Arrows         |  Altheory     |            |");
		System.out.println("| Samsung        |  Adidas       |            |");
		System.out.println("| Apple          |  Woodland     |            |");
		System.out.println("| Oneplus        |  Dnmx         |            |");
		System.out.println("| Cartyshop      |  H&M          |            |");
		System.out.println("| Hightlander    |  Panasonic    |            |");
		System.out.println("+================================+============+");
		System.out.print("Enter : ");
		SearchEngine.getInstance().getBrandProduct(Utility.in.next());
		
	}

}
