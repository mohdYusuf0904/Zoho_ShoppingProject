package com.eshopping.order.ui;

import java.time.LocalDateTime;

import com.eshopping.product.Product;
import com.eshopping.user.User;
import com.eshopping.util.Utility;

public class ProductSummaryUi {

	public boolean checkOut(Product p, User u) {

		System.out.println(
				"+======================Product Summary=====================================================================================================================");
		System.out.println("| User Name    : " + u.getName());
		System.out.println("| Phone number : " + u.getPhone());
		System.out.println("| Product Name : " + p.getBrand() + " " + p.getName());
		System.out.println("| Price        : " + p.getPrice());
		System.out.println("| Gst          : 5%");
		System.out.println("| Total Price  : " + (p.getPrice() + ((p.getPrice() * 5) / 100)));
		System.out.println(
				"|========================================================================================================================================================");
		System.out.println(
				"+=========[1.Summit]======[2.Back]==========================================================================================================================+");

		String cmmnd = "";
		do {
			System.out.print("Enter :");
			cmmnd = Utility.in.next();

			switch (cmmnd) {
			case "1":
				paymentDetails(u);
				return true;
			case "2":
				System.out.println("Back <===");
				break;
			default:
				System.out.println("Wrong Operation");
				break;
			}
		} while (!cmmnd.equals("2"));

		return false;
	}

	public void paymentDetails(User u) {

		System.out.print("| Enter a address:");
		Utility.in.nextLine();
		u.setAddress(Utility.in.nextLine());

		String command = "";
		do {
			System.out.println("| * cod(Cash on Delivery : 1");
			System.out.println("| * Upi (Upi option is not available right now) : 2");

			System.out.print("| Enter :");
			command = Utility.in.next();
			switch (command) {

			case "1":
				orderPlaced();
				break;
			case "2":
				System.out.println("| the company had to disable UPI transactions for the app as well");
				System.out.println("| Pay on the time of delivery ;)");
				break;

			default:
				System.out.println("| Invalid option");
			}

		} while (!command.equals("1"));

	}

	private void orderPlaced() {

		System.out.println(" | Date Of Ordered : " + LocalDateTime.now());

		try {
			System.out.print("| Product Placed");
			Thread.sleep(1000);
			System.out.print("==");
			Thread.sleep(1000);
			System.out.print("==");
			Thread.sleep(1000);
			System.out.print("==");
			Thread.sleep(1000);
			System.out.print("Packed");
			Thread.sleep(1000);
			System.out.print("==");
			System.out.print("==");
			Thread.sleep(1000);
			System.out.print("---");
			System.out.print("Shipped");
			Thread.sleep(1000);
			System.out.print("--");
			Thread.sleep(1000);
			System.out.print("--");
			Thread.sleep(1000);
			System.out.print("Delivered\n");
			System.out.println(
					"+===============[2.Back]==============================================================================================================\n");

			System.out.print(" Enter :");
			while (!Utility.in.next().equals("2")) {
				System.out.println("Wrong command");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
