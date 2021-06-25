package com.eshopping.user;
import com.eshopping.shopping.Shopping;
import com.eshopping.util.UtilUser;

public class UserManager {
	
	private  UserDataBase userDatabase ;
	private  static UserManager userManager;
	private UtilUser utilUser;
	
	private UserManager(UserDataBase userManager,UtilUser utilUser) {
		this.userDatabase = userManager;
		this.utilUser=utilUser;
	}
	
	
	public void printUserDeatils() {
		utilUser.getAccountView().accountDetails(Shopping.getInstance().getUser());
	}
	
	
	public  boolean IsUserExist(String userEmail,String password) {
		
		for(User user :userDatabase.getUser())
		{
			
			if(userEmail.equals(user.getEmail()) && password.equals(user.getPassword()))
			{
				Shopping.getInstance().SetUser(user);
				return true;
			}
			
		}
		return false;	
	}
	
	
	public  boolean isEmailAlreadyHas(String email)
	{
		
		for(User user : userDatabase.getUser())
		{
			
			if(user.getEmail().equals(email))
			{
				return true;
			}
			
		}
		
		return false;
		
	}
	
	
	public void StoreUser(User u) {
		
		userDatabase.addUser(u);
	}

	
	public boolean isValidEmail(String s) {
	
		if(s.length()>1 && s.contains("@"))
		{
			return true;
		}
		
		return false;
	}


	public  User isUserValid(String email, String phoneNum) {
			
			
			for(User u : userDatabase.getUser())
			{
				
				if(u.getEmail().equals(email) && u.getPhone().endsWith(phoneNum))
				{
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
		
		utilUser.getLoginUi().loginPage();
	}


	public void setPassword(User u) {
		utilUser.getSignUp().setPassword(u);
	}


	public void userOperation() {
		
		utilUser.getUserOperation().userOperation();;
	}
	
	public static UserManager getInstance() {
		
		if(userManager==null)
		{
			userManager=new UserManager(new UserDataBase(),new UtilUser());
		}
		return userManager;
	}


	
}
