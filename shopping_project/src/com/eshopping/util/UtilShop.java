package com.eshopping.util;

import com.eshopping.shopping.ui.UiShopping;

public class UtilShop {

	private static UtilShop utilShop;
	private UiShopping uishop;

	public UiShopping getUishop() {
	
		if(uishop==null)
		{
			uishop = new UiShopping();
		}
		return uishop;
	}

	
	
}
