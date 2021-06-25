package com.eshopping.util;

import com.eshopping.buy.ui.*;

public class UtilBuy {

	
	private ElectronicBuyUi ebuyUi;
	private FashionBuyUi fBuyUi ;
	private ChooseOptionUi chooseOption ;
	
	
	public ElectronicBuyUi getEbuyui() {
	
		if(ebuyUi==null)
		{
			ebuyUi = new ElectronicBuyUi();
		}
		
		return ebuyUi;
	}
	
	
	
	public FashionBuyUi getFbuyui() {
		
		if(fBuyUi==null)
		{
			fBuyUi = new FashionBuyUi(); 
		}
		
		return fBuyUi;
	}
	
	
	public  ChooseOptionUi getChooseoption() {
	
		if(chooseOption==null)
		{
			chooseOption=new ChooseOptionUi();
		}
		
		return chooseOption;
	}
	
	
	
	
}
