package com.eshopping.shopping;

import com.eshopping.product.store.EProductStore;
import com.eshopping.product.store.FashionStore;
import com.eshopping.user.User;
import com.eshopping.util.UtilShop;

public class Shopping {

	private User user;
	private static Shopping shop;
	private UtilShop utilShop;

	private Shopping(UtilShop utilShop) {

		this.utilShop = utilShop;
		EProductStore.getInstance().loadProduct();
		FashionStore.getInstance().loadProducts();
	}

	public void SetUser(User u) {
		user = u;
	}

	public User getUser() {

		return user;
	}

	public void shoppingPage() {

		if (user != null)
			utilShop.getUishop().shopCommand();
	}

	public static Shopping getInstance() {

		if (shop == null) {
			shop = new Shopping(new UtilShop());
		}

		return shop;
	}

}
