package com.eshopping.util;

import com.eshopping.cart.ui.MyCartUi;

public class UtilCart {

	private MyCartUi myCartUi;

	public MyCartUi getMyCartUi() {

		if (myCartUi == null) {
			myCartUi = new MyCartUi();
		}

		return myCartUi;
	}

}
