package com.eshopping.util;

import com.eshopping.user.ui.*;

public class UtilUser {

	private UiOperation userOperation;
	private LoginUi loginui;
	private SignupUi signUi;
	private UiUserHelp userhelp;
	private AccountViewUi accountView;

	public AccountViewUi getAccountView() {

		if (accountView == null) {
			accountView = new AccountViewUi();
		}

		return accountView;
	}

	public SignupUi getSignUp() {

		if (signUi == null) {
			signUi = new SignupUi();
		}

		return signUi;
	}

	public LoginUi getLoginUi() {

		if (loginui == null) {
			loginui = new LoginUi();
		}

		return loginui;
	}

	public UiOperation getUserOperation() {

		if (userOperation == null) {
			userOperation = new UiOperation();
		}

		return userOperation;
	}

	public UiUserHelp getUserHelp() {

		if (userhelp == null) {
			userhelp = new UiUserHelp();
		}

		return userhelp;
	}

}
