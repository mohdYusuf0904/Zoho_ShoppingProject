package com.eshopping.user.ui;

import com.eshopping.user.User;
import com.eshopping.user.UserManager;
import com.eshopping.util.Utility;

public class SignupUi {

	public void signUpPage() {

		User u = new User();
		setName(u);
		setEmail(u);
		setPhone(u);
		setPassword(u);
		UserManager.getInstance().StoreUser(u);

	}

	private void setName(User u) {
		System.out.print("\nEnter a Name:");
		u.setName(Utility.in.nextLine());
	}

	private void setEmail(User u) {

		System.out.print("\nEnter a Email:");
		u.setEmail(Utility.in.next());

		while (UserManager.getInstance().isEmailAlreadyHas(u.getEmail())
				|| !UserManager.getInstance().isEmailValid(u.getEmail())) {
			System.out.println("\nAlready Exists! please use different email id");
			System.out.println("Or Enter a correct email format\n");
			System.out.print("Enter :");
			u.setEmail(Utility.in.next());
		}

	}

	private void setPhone(User u) {

		System.out.print("\nEnter a Phone number:");
		u.setPhone(Utility.in.next());

		while (u.getPhone().length() < 10
				|| u.getPhone().length() > 10 && UserManager.getInstance().isPhoneNumberValid(null)) {
			System.out.println("Not valid number : must contains 10 digit number");
			System.out.print("Enter:");
			u.setPhone(Utility.in.next());

		}

	}

	public void setPassword(User u) {

		System.out.print("\nEnter a password:");
		u.setPassword(" ");

		while (u.getPassword().length() < 8) {
			System.out.println("password length must be 8 or greater than that");
			System.out.print("Enter:");
			u.setPassword(Utility.in.next());
		}

		System.out.println("\nRe-enter a password");
		System.out.print("Enter:");

		while (!Utility.in.next().equals(u.getPassword())) {

			System.out.println("Re-password must be same");
			System.out.print("Enter:");
		}

	}

}
