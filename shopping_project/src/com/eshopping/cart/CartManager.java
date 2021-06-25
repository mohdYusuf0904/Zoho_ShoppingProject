package com.eshopping.cart;

import java.util.List;

import com.eshopping.product.Product;
import com.eshopping.shopping.Shopping;
import com.eshopping.util.UtilCart;

public class CartManager {

	private static CartManager cartManagerment;
	private CartDB cartDB ;
	private UtilCart utilCart;
	
	private CartManager(CartDB cartDB,UtilCart utilCart)
	{
		this.cartDB = cartDB;
		this.utilCart=utilCart;
	}
	
	public boolean addCart(Product p) {
		
		
		if(!cartDB.isNull() &&  cartDB.getCart(Shopping.getInstance().getUser()).indexOf(p)!=-1) {
		
			return true;
		}
		
		cartDB.addCart(Shopping.getInstance().getUser(), p);
		return false;
		
	}
	
	public void cartRemove(int removeId) {
		
		cartDB.removeInCart(cartDB.getCart(Shopping.getInstance().getUser()).get(removeId));
		
	}

	
	
	public void removeCartList(List<Product> list)
	{
		for(Product p: list)
		{
			cartRemove(list.indexOf(p));
		}
		
	}
	

	public void printCartDetails() {
		
		utilCart.getMyCartUi().myCart(cartDB.getCart(Shopping.getInstance().getUser()));
		
	}


	
	public static CartManager getInstance() {
		
		if(cartManagerment==null)
		{
			cartManagerment=new CartManager(new CartDB(),new UtilCart());
		}
		return cartManagerment;	
	}

	
	
}

