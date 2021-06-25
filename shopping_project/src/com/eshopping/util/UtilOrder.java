package com.eshopping.util;
import com.eshopping.order.ui.InvoiceUI;
import com.eshopping.order.ui.OrderListUi;
import com.eshopping.order.ui.ProductSummaryUi;

public class UtilOrder{
	
	private ProductSummaryUi productSummaryUi;
	private OrderListUi orderListUI;
	private InvoiceUI invoiceUI;
	
	
	public InvoiceUI getInvoiceUI() {
		
		if(invoiceUI==null)
		{
			invoiceUI = new InvoiceUI();
		}
		return invoiceUI;
	}
	
	
	public OrderListUi getOrderListUi()
	{
		if(orderListUI==null)
		{
			orderListUI = new OrderListUi();
		}
		return orderListUI;
	}
	
	
	public ProductSummaryUi getProductSummaryUi() {
		
		if(productSummaryUi==null)
		{
			productSummaryUi = new ProductSummaryUi();
		}
		return productSummaryUi;
	}
	
	
	
}
