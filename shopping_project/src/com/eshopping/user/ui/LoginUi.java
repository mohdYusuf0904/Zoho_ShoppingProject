package com.eshopping.user.ui;
import com.eshopping.shopping.Shopping;
import com.eshopping.user.UserManager;
import com.eshopping.util.Utility;

public class LoginUi {
	
	
	 public void loginPage() {
		
		System.out.println("Please make sure enter a correct details");
		System.out.println("Only three tries");
		System.out.println();
		String email="",password;
		int i=3;
		
		do {
		
		if(i==0) {		
				
				if(isReSignup())
				{
					UserManager.getInstance().createSignUp();
				
				}
				
				break;
		}else if(i<3)
		{
			System.out.println("\nWrong password or email !");
			System.out.println("only :"+i+" try remains");
			
			if(isChangePassword())
			{
				UserManager.getInstance().changePassword();
				
			}
			
		}
		
	
		while(!UserManager.getInstance().isEmailValid(email)) {
			
			System.out.print("\nEnter a mailid:");
			email = Utility.in.next();
		}
		
		System.out.print("\nEnter a password:");
		password =  Utility.in.next();
				
		i--;
		
	 
		}while(!UserManager.getInstance().IsUserExist(email,password));
		
		if(i>0)
		{
			Shopping.getInstance().shoppingPage();
		}
		
  }

	 private boolean isReSignup() {
		
		System.out.println("\nSorry! exceeds the limit.");
		System.out.println("\nsign up! ");
		System.out.println("Want to sign up y-signUp n-exit");
		System.out.println("y/n");
		if(Utility.in.next().equalsIgnoreCase("y"))
		{
			return true;
		}   
		
		return false;

	}
	
	
	private  boolean isChangePassword()
	{

		System.out.println("Forgot password");
		System.out.println("y/n");
		if(Utility.in.next().equalsIgnoreCase("y"))
		{
			return true;
		}		
		return false;
	}
	
	
}
