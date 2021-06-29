package com.eshopping.search.ui;

import java.util.List;

import com.eshopping.product.FashionProduct;
import com.eshopping.search.SearchEngine;
import com.eshopping.util.Utility;

public class FashionCatagoryUI {

	
	public void ChoosePerson(List<FashionProduct> product)
	{

		String cmmnd="";
		do {
			
		System.out.println("+-----------------------Person------------------------------+");
		System.out.println("|-----[1.Men]-----[2.Women]----[3.Kid]----[4.Back]----------|");
		System.out.println("+-----------------------------------------------------------+");
		System.out.print("Enter:");
		cmmnd=Utility.in.next();
		switch(cmmnd)
		{
			
			case "1":
				selectedPersonItems(SearchEngine.getInstance().getProductMen(product));
				break;
			case "2":
				selectedPersonItems(SearchEngine.getInstance().getProductWomen(product));
				break;
			case "3":
				selectedPersonItems(SearchEngine.getInstance().getProductKid(product));
				break;
			case "4":
				System.out.println("Back <==");
				break;
			default:
				System.out.println("Wrond Operation");
		}
		
	}while(!cmmnd.equals("4"));
	
	
	}

	private void selectedPersonItems(List<FashionProduct> product) {
		
		String command="";
		do {

			System.out.println("+-----------[catagory]-------------+");
			System.out.println("|----------------------------------|");
			System.out.println("| 1.Topwear    | 2.Bottomwear	   |");
			System.out.println("| 3.Footwear   | 4.Back            |");
			if(product.get(0).getPerson().equalsIgnoreCase("women"))
			System.out.println("| 5.Sarees     |                   |");
			System.out.println("+--------------+-------------------+");
			System.out.print("Enter:");
			command=Utility.in.next();
			switch(command) {
				
					case "1":
						getTopWear(product);
						break;
					case "2":
						getBottomWear(product);
						break;
					case "3":
						getFootWear(product);
						break;
					case "4":
						System.out.println("Back <==");
						
						break;
					case "5":
						if(product.get(0).getPerson().equalsIgnoreCase("women")) 
						SearchEngine.getInstance().searchCatagory(product, "saree");
						else
							System.out.println("Wrond Operation");
						break;
					default:
						System.out.println("Wrond Operation");
		
			}
			
		}while(!command.equals("4"));
		
	}

	private void getBottomWear(List<FashionProduct> product) {
		String command="";
		do {

		System.out.println("+-----------[catagory]-------------+");
		System.out.println("|----------------------------------|");
		System.out.println("| 1.Jeans      | 2.Formal     	   |");
		System.out.println("| 3.Back       |                   |");
		System.out.println("+--------------+-------------------+");
		System.out.print("Enter:");
		command=Utility.in.next();
		switch(command) {
			
				case "1":
					SearchEngine.getInstance().searchCatagory(product,"jeans");
					break;
				case "2":
					SearchEngine.getInstance().searchCatagory(product,"formal");
					break;
				case "3":
					System.out.println("Break <==");
					break;
				default:
					System.out.println("Wrond Operation");
	
		}
		
	}while(!command.equals("3"));

		
	}

	private void getFootWear(List<FashionProduct> product) {
		
		String command="";
		do {
		
		System.out.println("+-----------[catagory]-------------+");
		System.out.println("|----------------------------------|");
		System.out.println("| 1.Sandals    | 2.Shoes     	   |");
		System.out.println("| 3.Flipflop   | 4.Back            |");
		System.out.println("+--------------+-------------------+");
		System.out.print("Enter:");
		command=Utility.in.next();
		switch(command) {
			
				case "1":
					SearchEngine.getInstance().searchCatagory(product,"sandals");
					break;
				case "2":
					SearchEngine.getInstance().searchCatagory(product,"shoe");
					break;
				case "3":
					SearchEngine.getInstance().searchCatagory(product,"flipflop");
					break;
				case "4":
					System.out.println("Back <==");
					break;
				default:
					System.out.println("Wrond Operation");
	
		}
		
	}while(!command.equals("4"));

		
	}

	private void getTopWear(List<FashionProduct> product) {
		
		String command="";
		do {
	
		System.out.println("+-----------[catagory]-------------+");
		System.out.println("|----------------------------------|");
		System.out.println("| 1.Shirt      | 2.Tshirt     	   |");
		System.out.println("| 3.Hoodie     | 4.Sweatshirts     |");
		System.out.println("| 5.Back       |                   |");
		System.out.println("+--------------+-------------------+");
		System.out.print("Enter:");
		command=Utility.in.next();
		switch(command) {
			
				case "1":
					SearchEngine.getInstance().searchCatagory(product,"shirt");
					break;
				case "2":
					SearchEngine.getInstance().searchCatagory(product,"tshirt");
					break;
				case "3":
					SearchEngine.getInstance().searchCatagory(product,"hoodie");
					break;
				case "4":
					SearchEngine.getInstance().searchCatagory(product,"Sweatshirt");
					break;
				case "5":
					System.out.println("Break <==");
					break;
				default:
					System.out.println("Wrond Operation");
	
		}
		
	}while(!command.equals("5"));


	}

}
