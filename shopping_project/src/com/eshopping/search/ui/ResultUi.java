package com.eshopping.search.ui;
import java.util.List;

import com.eshopping.buy.BuyProduct;
import com.eshopping.product.Product;
import com.eshopping.search.SortProducts;
import com.eshopping.util.Utility;

public class ResultUi {
	
	public  void printProducts(List<Product> productList) {
		
		
		if(productList.isEmpty())
		{
			
			System.out.println("Result : Not Found");
			return;
		}else {
		productList.sort(new SortProducts());
		
		System.out.println("Want to sort : y/n");
		if(Utility.in.next().equalsIgnoreCase("y"))
		sortingOption(productList);
		
		  for(Product p:productList) {	  
		  System.out.println("+----+--------------+----------------------------------------+------------------------------------------------------------------------------------------------------+");	
		  System.out.println("id : "+(productList.indexOf(p)+1)+" <== [Buy] \n"+ "Name : " +  p.getName()+"\nProduct Details : "+p.getDescription()+"\nPrice :  "+ p.getPrice()+"\n");
		  System.out.println("+----+--------------+----------------------------------------+------------------------------------------------------------------------------------------------------+");	
		  }
		}
		
		
		
		BuyProduct.getInstance().clickBuy(productList.get(userSearch(productList.size())));
		
  }

	private void sortingOption(List<Product> productList) {

		System.out.println("Sorting order");
		System.out.println("1.Lower to Higher");
		System.out.println("2.Higher to lower");
		System.out.println("Enter : ");
		
		SortProducts.setSortingOrder(Utility.in.nextInt());
		productList.sort(new SortProducts());

	}

	private int userSearch(int size) {
		
		int command=0;
		System.out.print("Enter : ");
		command=Utility.in.nextInt();
		
		while(command<=0 || command>size)
		{
			
			System.out.println();
			System.out.print("Enter again : ");
			command=Utility.in.nextInt();
		
		}
		
		return (command-1);
	}
	
	

	
}
