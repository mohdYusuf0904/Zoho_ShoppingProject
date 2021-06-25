package com.eshopping.product;
import java.util.List;

public class ProductManager {
	
	private ProductsDataBase productsDataBase;
	private static ProductManager productManager;
	
	
	private ProductManager(ProductsDataBase productsDataBase) {
		this.productsDataBase=productsDataBase;
	}
	

	public void addProducts(Product p) {
		
		productsDataBase.StoreProducts(p);
	}
	
	public List<Product> getAllProducts() {
		
		return productsDataBase.getProduct();
	}

	
	
	public void removeProduct(Product p) {
		
		productsDataBase.removeProduct(p);
	}



	public void removeProductList(List<Product> list) {
		
		for(Product p: list)
		{
			removeProduct(p);
		}
	}

	
	public static ProductManager getInstance() {
		
		if(productManager==null)
		{
			
			productManager = new ProductManager(new ProductsDataBase());
		}
		
		return productManager;
	}



}
