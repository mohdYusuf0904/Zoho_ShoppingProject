package com.eshopping.search;

import java.util.Comparator;

import com.eshopping.product.Product;

public class SortProducts implements Comparator<Product> {

	private static int sortingOrder=1;
	
	public static void setSortingOrder(int i)
	{
		sortingOrder=i;
	}

	public int compare(Product o1, Product o2) {
		
		if(sortingOrder>2)
			sortingOrder=1;
		
		switch(sortingOrder)
		{
			
			case 1:
				return Double.valueOf(o1.getPrice()).compareTo(Double.valueOf(o2.getPrice()));
			case 2:
				return Double.valueOf(o2.getPrice()).compareTo(Double.valueOf(o1.getPrice()));
			
		}
		return 0;
		
	}


	
}
