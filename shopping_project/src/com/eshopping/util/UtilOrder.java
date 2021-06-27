package com.eshopping.util;

import com.eshopping.order.ui.InvoiceUI;
import com.eshopping.order.ui.OrderListUi;
import com.eshopping.order.ui.ProductSummaryUi;
import com.eshopping.order.ui.QuantityUI;

public class UtilOrder {

	private ProductSummaryUi productSummaryUi;
	private OrderListUi orderListUI;
	private InvoiceUI invoiceUI;
	private QuantityUI quantityUi;

	public QuantityUI getQuantityUI() {

		if (quantityUi == null) {
			quantityUi = new QuantityUI();
		}
		return quantityUi;
	}

	public InvoiceUI getInvoiceUI() {

		if (invoiceUI == null) {
			invoiceUI = new InvoiceUI();
		}
		return invoiceUI;
	}

	public OrderListUi getOrderListUi() {
		if (orderListUI == null) {
			orderListUI = new OrderListUi();
		}
		return orderListUI;
	}

	public ProductSummaryUi getProductSummaryUi() {

		if (productSummaryUi == null) {
			productSummaryUi = new ProductSummaryUi();
		}
		return productSummaryUi;
	}

}
