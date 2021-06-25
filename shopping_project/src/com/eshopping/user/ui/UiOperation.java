package com.eshopping.user.ui;

import com.eshopping.user.UserManager;
import com.eshopping.util.Utility;

public class UiOperation {

	public void userOperation() {

		String command = "";
		System.out.println("-=--Welcome to E-Shopping Cart----");

		do {

			System.out.println("+================+");
			System.out.println("|    1.Login     |");
			System.out.println("|    2.Sign up   |");
			System.out.println("|    9.Exit      |");
			System.out.println("+================+");
			System.out.println();
			System.out.print("Enter :");
			command = Utility.in.next();
			Utility.in.nextLine();

			switch (command) {
			case "1":
				UserManager.getInstance().logIn();
				break;
			case "2":
				UserManager.getInstance().createSignUp();
				break;
			case "9":
				System.out.println("Exit!!");
				System.out.println("Thanks for choosing us");
				System.out.println("Stay with Us");
				break;
			default:
				System.out.println("Incorrect Operation");
				break;
			}
		} while (!command.equals("9"));

	}
}