package com.eshopping.order;
import java.time.LocalDateTime;
import java.util.Iterator;
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

	private OrderManager(OrderDB orderDB, UtilOrder utilOrder) {
		this.orderDB = orderDB;
		this.utilOrder = utilOrder;
	}

	public void printInvoice(int id) {

		utilOrder.getInvoiceUI().printInvoice(Shopping.getInstance().getUser(),
				orderDB.getMyOrder(Shopping.getInstance().getUser()).get(id));

	}

	public void printOrdersDetails() {

		utilOrder.getOrderListUi().orderLists(orderDB.getMyOrder(Shopping.getInstance().getUser()));

	}

	public void buyCartProducts(List<Product> list) {

		utilOrder.getProductSummaryUi().paymentDetails(Shopping.getInstance().getUser());
		ProductManager.getInstance().removeProductList(list);
		addCartOrder(list);
		CartManager.getInstance().removeCartList(list);

	}

	private void addCartOrder(List<Product> list) {

		for (Product p : list) {
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

		if (utilOrder.getProductSummaryUi().checkOut(p, Shopping.getInstance().getUser())) {

			orderDB.addMyOrder(Shopping.getInstance().getUser(), addOrder(p));
			CartManager.getInstance().removeProductInCartIfExists(p);
			ProductManager.getInstance().removeProduct(p);
		}
	}

	public boolean orderAgain(int id) {

		Product p = orderDB.getMyOrder(Shopping.getInstance().getUser()).get(id).getProduct();
		for (Product product : ProductManager.getInstance().getAllProducts()) {
			if (product.getName().equals(p.getName()) && product.getPrice() == p.getPrice()
					&& product.getDescription().equals(p.getDescription())) {
				BuyProduct.getInstance().clickBuy(product);
				return true;
			}
		}
		return false;
	}

	public void buyListOfProducts(Product p, int quantity) {

		Iterator<Product> i = ProductManager.getInstance().getAllProducts().listIterator();

		while (i.hasNext()) {

			Product product = i.next();
			if (quantity > 1 && !p.equals(product) && p.getName().equals(product.getName())
					&& p.getPrice() == product.getPrice() && p.getDescription().equals(product.getDescription())) {

				i.remove();
				orderDB.addMyOrder(Shopping.getInstance().getUser(), addOrder(product));
				quantity--;
			}
		}

	}

	public void quantityPage(Product p) {

		utilOrder.getQuantityUI().addQuantity(p);

	}

	public static OrderManager getInstance() {

		if (orderManager == null) {
			orderManager = new OrderManager(new OrderDB(), new UtilOrder());
		}

		return orderManager;
	}

}