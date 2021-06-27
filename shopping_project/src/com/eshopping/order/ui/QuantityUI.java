package com.eshopping.order.ui;

import com.eshopping.order.OrderManager;
import com.eshopping.product.Product;
import com.eshopping.product.ProductManager;
import com.eshopping.util.Utility;

public class QuantityUI {

	public void addQuantity(Product p) {

		String cmmnd = "";
		int quantity = 1;
		do {

			System.out.println("+-------------[Quantity]----------------+");
			System.out.println("|  1.Add Quantity[" + quantity + "]                    |");
			System.out.println("|  2.Remove Quantity[" + quantity + "]                 |");
			System.out.println("|  3.Back                               |");
			System.out.println("+---------------------------------------+");
			System.out.print("| Enter:");
			cmmnd = Utility.in.next();

			switch (cmmnd) {

			case "1":
				quantity = setQuantity(p);
				break;
			case "2":
				if (quantity > 1) {
					quantity = removeQuantity(quantity);
				} else
					System.out.println("| Can't removed, minimum one item in list");
				break;
			case "3":
				if (quantity > 1)
					OrderManager.getInstance().buyListOfProducts(p, quantity);
				break;

			default:
				System.out.println("| Wrong Operation");

			}

		} while (!cmmnd.equals("3"));

	}

	private int removeQuantity(int quantity) {

		int numOf = -1;

		while (numOf <= 0 || numOf >= quantity) {
			System.out.print("| Enter a number of quantity :");
			numOf = Utility.in.nextInt();

		}

		return numOf;
	}

	private int setQuantity(Product p) {

		int numOf = 1;
		int total = ProductManager.getInstance().quantityCheck(p);
		System.out.println("| Number Of Items: " + (total));
		if (total > 1) {
			System.out.print("| Enter a number of items : ");
			numOf = Utility.in.nextInt();
			while (numOf < 1 || numOf > total) {
				System.out.println("| Sorry only " + total + " items left ");
				System.out.print("| Enter again :");
				numOf = Utility.in.nextInt();
			}

		} else {
			System.out.println("| Oops,Sorry can't add more items,only one left");
		}

		return numOf;
	}

}
