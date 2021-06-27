package com.eshopping.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.eshopping.product.FashionProduct;
import com.eshopping.product.Product;
import com.eshopping.product.ProductManager;
import com.eshopping.util.UtilSearch;

public class SearchEngine{

	private static SearchEngine searchEngine;
	private UtilSearch utilSearch;

	private SearchEngine(UtilSearch utilSearch) {

		this.utilSearch = utilSearch;
	}

	public void productsList() {

		utilSearch.getResultUi().printProducts(ProductManager.getInstance().getAllProducts());	;
	}

	public void getBrandProduct(String next) {

		List<Product> list = new ArrayList<>();

		for (Product p : ProductManager.getInstance().getAllProducts()) {

			if (p.getBrand().toLowerCase().contains(next)) {
				list.add(p);
			}
		}
		utilSearch.getResultUi().printProducts(list);
	}

	
	public void getProduct(String next) {
		
		List<Product> list = new ArrayList<>();

		for (Product p : ProductManager.getInstance().getAllProducts()) {

			if (p.getName().toLowerCase().contains(next.toLowerCase())) {
				list.add(p);
			}
		}

		utilSearch.getResultUi().printProducts(list);
	}

	public int sizeOfProduct() {
		return ProductManager.getInstance().getAllProducts().size();
	}

	public void searchCatagory(List<FashionProduct> list, String args) {

		List<Product> productList = new ArrayList<>();

		for (FashionProduct p : list) {
			if (p.getCatagory().equalsIgnoreCase(args)) {
				productList.add(p);
			}
		}
		utilSearch.getResultUi().printProducts(productList);
		SearchEngine.getInstance().removeNotUnique(list);
		 
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

	public List<FashionProduct> getProductMen(List<FashionProduct> menProducts) {

		List<FashionProduct> mens = new ArrayList<>();

		for (FashionProduct p : menProducts) {

			if (p.getPerson().equalsIgnoreCase("men")) {
				mens.add(p);
			}
		}
		return mens;
	}

	public List<FashionProduct> getProductWomen(List<FashionProduct> Products) {

		List<FashionProduct> womenProduct = new ArrayList<>();

		for (FashionProduct p : Products) {

			if (p.getPerson().equalsIgnoreCase("women")) {
				womenProduct.add(p);
			}

		}

		return womenProduct;

	}

	public List<FashionProduct> getProductKid(List<FashionProduct> Products) {

		List<FashionProduct> kidsProduct = new ArrayList<>();

		for (FashionProduct p : Products) {

			if (p.getPerson().equalsIgnoreCase("kids")) {
				kidsProduct.add( p);
			}

		}

		return kidsProduct;

	}

	public void searchFashions() {

		List<FashionProduct> product = new ArrayList<>();
		for (Product p : ProductManager.getInstance().getAllProducts()) {

			if (p instanceof FashionProduct) {
				product.add((FashionProduct) p);
			}
		}

		utilSearch.getFashionCatagory().ChoosePerson(product);
	}
	
	
	private void removeNotUnique(List<FashionProduct> list)
	{
		
		Iterator<FashionProduct> iterator = list.listIterator();
		while(iterator.hasNext())
		{
			if(!ProductManager.getInstance().getAllProducts().contains(iterator.next()))
			{
				iterator.remove();
			}	
		}
	}
	
	public static SearchEngine getInstance() {

		if (searchEngine == null) {
			searchEngine = new SearchEngine(new UtilSearch());
		}
		return searchEngine;
	}

}
