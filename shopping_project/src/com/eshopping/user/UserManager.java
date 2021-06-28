package com.eshopping.user;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.eshopping.shopping.Shopping;
import com.eshopping.util.UtilUser;

public class UserManager {

	private UserDataBase userDatabase;
	private static UserManager userManager;
	private UtilUser utilUser;

	private UserManager(UserDataBase userManager, UtilUser utilUser) {
		this.userDatabase = userManager;
		this.utilUser = utilUser;
	}

	public void printUserDeatils() {
		utilUser.getAccountView().accountDetails(Shopping.getInstance().getUser());
	}

	public boolean IsUserExist(String userEmail, String password) {

		for (User user : userDatabase.getUser()) {

			if (userEmail.equals(user.getEmail()) && password.equals(user.getPassword())) {
				Shopping.getInstance().SetUser(user);
				return true;
			}

		}
		return false;
	}

	public boolean isEmailAlreadyHas(String email) {

		for (User user : userDatabase.getUser()) {

			if (user.getEmail().equals(email)) {
				return true;
			}

		}

		return false;

	}

	public void StoreUser(User u) {
		
		userDatabase.addUser(u);
	
	}

	public boolean isPhoneNumberValid(String s) {

		Pattern p = Pattern.compile("[0-9]{10}");
		Matcher m = p.matcher(s);
		return m.matches();
	}

	public boolean isEmailValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public User isUserValid(String email, String phoneNum) {

		for (User u : userDatabase.getUser()) {

			if (u.getEmail().equals(email) && u.getPhone().endsWith(phoneNum)) {
				return u;
			}
		}

		return null;
	}

	public void createSignUp() {

		utilUser.getSignUp().signUpPage();
	}

	public void changePassword() {
		utilUser.getUserHelp().changePassword();
	}

	public void logIn() {

		if (utilUser.getLoginUi().loginPage())
			;
		{
			Shopping.getInstance().shoppingPage();
		}
	}

	public void setPassword(User u) {
		utilUser.getSignUp().setPassword(u);
	}

	public void userOperation() {

		utilUser.getUserOperation().userOperation();
		
	}

	public boolean isValidUsername(String name) {

		String regex = "^[A-Za-z]{3,29}$";

		Pattern p = Pattern.compile(regex);

		if (name == null) {
			return false;
		}

		Matcher m = p.matcher(name);

		return m.matches();
	}

	public static UserManager getInstance() {

		if (userManager == null) {
			userManager = new UserManager(new UserDataBase(), new UtilUser());
		}
		return userManager;
	}

}
