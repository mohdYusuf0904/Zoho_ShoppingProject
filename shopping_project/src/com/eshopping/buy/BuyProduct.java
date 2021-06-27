package com.eshopping.buy;

import com.eshopping.product.*;
import com.eshopping.util.UtilBuy;

public class BuyProduct {

	private static BuyProduct buyProduct;
	private UtilBuy utilBuy;

	private BuyProduct(UtilBuy utilBuy) {

		this.utilBuy = utilBuy;

	}

	public void clickBuy(Product p) {

		if (p instanceof FashionProduct) {
			utilBuy.getFbuyui().buyPage((FashionProduct) p);
		} else {
			utilBuy.getEbuyui().buyPage((ElectronicProduct) p);

		}

	}

	public void clickOption(Product p) {
		utilBuy.getChooseoption().userOperation(p);
	}

	public static BuyProduct getInstance() {

		if (buyProduct == null) {
			buyProduct = new BuyProduct(new UtilBuy());
		}

		return buyProduct;

	}

}
