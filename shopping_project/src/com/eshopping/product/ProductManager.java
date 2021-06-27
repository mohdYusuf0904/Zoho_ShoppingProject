package com.eshopping.product;
import java.util.List;

public class ProductManager {
	
	private ProductsDataBase productsDataBase;
	private static ProductManager productManager;
	
	
	private ProductManager(ProductsDataBase productsDataBase) {
		this.productsDataBase=productsDataBase;
	}
	

	
	public int quantityCheck(Product product) {
		
		int numOf=0;
		
		for(Product p: productsDataBase.getProduct())
		{
			
			if(p.getName().equals(product.getName()) && p.getPrice()==product.getPrice() &&
					p.getDescription().equals(product.getDescription()))
			{
				numOf++;				
			}

		}
		return numOf;
		
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
		
		productsDataBase.removeAll(list);
	}

	
	public static ProductManager getInstance() {
		
		if(productManager==null)
		{
			
			productManager = new ProductManager(new ProductsDataBase());
		}
		
		return productManager;
	}



}
