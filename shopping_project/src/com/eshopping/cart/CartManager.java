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
		
		
		if(!cartDB.isNull(Shopping.getInstance().getUser()) &&  cartDB.getCart(Shopping.getInstance().getUser()).contains(p)) {
		
			return true;
		}
		
		cartDB.addCart(Shopping.getInstance().getUser(), p);
		return false;
		
	}
	
	public void cartRemove(int removeId) {
	
		cartDB.removeInCart(Shopping.getInstance().getUser(), cartDB.getCart(Shopping.getInstance().getUser()).get(removeId));
	}

	public void removeProductInCartIfExists(Product p) {
		
		cartDB.removeInCart(Shopping.getInstance().getUser(), p);
		
	}

	public void removeCartList(List<Product> list)
	{
		cartDB.cartClear(Shopping.getInstance().getUser(),list);
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

