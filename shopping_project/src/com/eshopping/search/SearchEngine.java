package com.eshopping.search;
import java.util.ArrayList;
import java.util.List;

import com.eshopping.product.FashionProduct;
import com.eshopping.product.Product;
import com.eshopping.product.ProductManager;
import com.eshopping.product.entities.Fashion;
import com.eshopping.util.UtilSearch;

public class SearchEngine {

	private static SearchEngine searchEngine;
	private UtilSearch utilSearch;
	
	private SearchEngine(UtilSearch utilSearch) {
		
		this.utilSearch=utilSearch;
	}
	
	public void productsList() {
	
		utilSearch.getResultUi().printProducts(ProductManager.getInstance().getAllProducts());;
	}

	
	public void getBrandProduct(String next)
	{
		
		List<Product> list = new ArrayList<>();
		
		for(Product p :ProductManager.getInstance().getAllProducts()) {
				
			if(p.getBrand().toLowerCase().contains(next))
			{
					list.add(p);
			}
		
		}
		
		utilSearch.getResultUi().printProducts(list);
		
	}
	
	public void getProduct(String next) {
		
		List<Product> list = new ArrayList<>();
		
		for(Product p :ProductManager.getInstance().getAllProducts()) {
				
				if(p.getName().toLowerCase().contains(next.toLowerCase())) {
				list.add(p);
	       }
		}
		
		utilSearch.getResultUi().printProducts(list);
	}

	
	public int sizeOfProduct()
	{
		return ProductManager.getInstance().getAllProducts().size();
	}
	
	public void searchCatagory(List<FashionProduct> list,String args) {
		
		List<Product> productList = new ArrayList<>();
		
		for(Product p : list)
		{
			if(p.getName().toLowerCase().contains(args))
			{
				productList.add(p);
			}
			
		}
		utilSearch.getResultUi().printProducts(productList);
		
		
	}

	public void searchBrands() {
		
		utilSearch.getSearchBrandUi().searchBrands();
		
	}

	public void searchAll() {
		utilSearch.getSearchAllui().searchAll();
	}

	public void catagorySearch() {
		utilSearch.getCatagorySearchUi().catagorySearch();	
	}

	public void getMenu() {
		
		utilSearch.getUiMenu().userMenu();
	}
	
	public List<FashionProduct> getProductMen() {
		
		List<FashionProduct> menProduct = new ArrayList<>();
		
		for(Product p : ProductManager.getInstance().getAllProducts())
		{
			
			if(p instanceof FashionProduct && ((Fashion) p).getPerson().equalsIgnoreCase("men"))
			{
				menProduct.add((FashionProduct)p);
			}
			
		}
		
		return menProduct;
		
	}
	
	public List<FashionProduct> getProductWomen() {

		
		List<FashionProduct> womenProduct = new ArrayList<>();
		
		for(Product p : ProductManager.getInstance().getAllProducts())
		{
			
			if(p instanceof FashionProduct && ((Fashion) p).getPerson().equalsIgnoreCase("women"))
			{
				womenProduct.add((FashionProduct)p);
			}
			
		}
		
		return womenProduct;

	}
	public List<FashionProduct> getProductKid() {

		
		List<FashionProduct> kidsProduct = new ArrayList<>();
		
		for(Product p : ProductManager.getInstance().getAllProducts())
		{
			
			if(p instanceof FashionProduct && ((Fashion) p).getPerson().equalsIgnoreCase("kids"))
			{
				kidsProduct.add((FashionProduct)p);
			}
			
		}
		
		return kidsProduct;

	}
	
	public static SearchEngine getInstance() {

		if(searchEngine==null)
		{
			searchEngine = new SearchEngine(new UtilSearch());
		}
		return searchEngine;
	}

	public void searchFashions() {
		
		List<FashionProduct> product = new ArrayList<>();
		for(Product p:ProductManager.getInstance().getAllProducts())
		{
			
			if(p instanceof FashionProduct)
			{
				product.add((FashionProduct)p);
			}
			
		}
		
		utilSearch.getFashionCatagory().ChoosePerson(product);
		
	}


}
