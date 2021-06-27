package com.eshopping.util;

import com.eshopping.search.ui.*;

public class UtilSearch {

	private ResultUi resultUi = new ResultUi();
	private SearchAllUi searchAllui;
	private SearchUi searchUi;
	private SearchBrandUI searchBrandUi;
	private UIMenu uiMenu;
	private FashionCatagoryUI fashionCatagory;

	public ResultUi getResultUi() {

		if (resultUi == null) {
			resultUi = new ResultUi();
		}

		return resultUi;
	}

	public FashionCatagoryUI getFashionCatagory() {

		if (fashionCatagory == null) {
			fashionCatagory = new FashionCatagoryUI();
		}

		return fashionCatagory;
	}

	public SearchAllUi getSearchAllui() {

		if (searchAllui == null) {
			searchAllui = new SearchAllUi();

		}
		return searchAllui;

	}

	public SearchBrandUI getSearchBrandUi() {

		if (searchBrandUi == null) {
			searchBrandUi = new SearchBrandUI();
		}
		return searchBrandUi;
	}

	public SearchUi getCatagorySearchUi() {

		if (searchUi == null) {
			searchUi = new SearchUi();
		}
		return searchUi;

	}

	public UIMenu getUiMenu() {

		if (uiMenu == null) {
			uiMenu = new UIMenu();
		}
		return uiMenu;
	}

}
