package com.eshopping.order;
import java.time.LocalDateTime;
import java.util.List;
import com.eshopping.buy.BuyProduct;
import com.eshopping.cart.CartManager;
import com.eshopping.product.Product;
import com.eshopping.product.ProductManager;
import com.eshopping.shopping.Shopping;
import com.eshopping.util.UtilOrder;

public class OrderManager {

	private static OrderManager orderManager;
	private OrderDB orderDB;
	private UtilOrder utilOrder;

	private OrderManager(OrderDB orderDB,UtilOrder utilOrder) {
		this.orderDB = orderDB;
		this.utilOrder=utilOrder;
	}

	public void printInvoice(int id) {
		
		utilOrder.getInvoiceUI().printInvoice(Shopping.getInstance().getUser(),orderDB.getMyOrder(Shopping.getInstance().getUser()).get(id));
		
	}

	public void printOrdersDetails() {

		utilOrder.getOrderListUi().orderLists(orderDB.getMyOrder(Shopping.getInstance().getUser()));
		
	}

	public void buyCartProducts(List<Product> list) {
		
		utilOrder.getProductSummaryUi().paymentDetails(Shopping.getInstance().getUser());
		addCartOrder(list);
		CartManager.getInstance().removeCartList(list);
		ProductManager.getInstance().removeProductList(list);	
	}

	private void addCartOrder(List<Product> list) {
		
		for(Product p : list)
		{
			orderDB.addMyOrder(Shopping.getInstance().getUser(), addOrder(p));
		}
	}

	private Order addOrder(Product p) {
		
		Order order = new Order();
		order.setProduct(p);
		order.setDate(LocalDateTime.now());
		
		return order;
	}
	
	public void buyProduct(Product p) {
	
		if(utilOrder.getProductSummaryUi().checkOut(p,Shopping.getInstance().getUser()))
		{
			
			orderDB.addMyOrder(Shopping.getInstance().getUser(),addOrder(p));
			ProductManager.getInstance().removeProduct(p);
		}
	}
	

	public boolean orderAgain(int id) {
		
		
		Product p = orderDB.getMyOrder(Shopping.getInstance().getUser()).get(id).getProduct();
		for(Product product : ProductManager.getInstance().getAllProducts())
		{
			if(product.getName().equals(p.getName()) && product.getPrice()==p.getPrice() && product.getDescription().equals(p.getDescription()))
			{
				BuyProduct.getInstance().clickBuy(product);
				return true;
			}
		}
		return false;
	}
	
	public static OrderManager getInstance() {
		
		if(orderManager==null)
		{
			orderManager=new OrderManager(new OrderDB(),new UtilOrder());
		}
		
		return orderManager;
	}

}