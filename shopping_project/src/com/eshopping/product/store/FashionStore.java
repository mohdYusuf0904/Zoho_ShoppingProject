package com.eshopping.product.store;

import com.eshopping.product.FashionProduct;
import com.eshopping.product.ProductManager;
import com.eshopping.product.entities.Fashion;

public class FashionStore {

	private static FashionStore fashionStore = new FashionStore();

	private FashionStore() {

	}

	public void loadProducts() {

		loadShirts();
		loadPant();
		loadSarees();
		loadWinterWear();
		loadTshirt();
		loadShoe();
		loadSandals();
		loadFlipFLop();
	}

	private void loadFlipFLop() {

		FashionProduct flipflop = null;
		String color[] = { "Red", "Black" };
		String size[] = { "42", "44", "48" };
		String brand[] = { "adidas", "crocs", "woodland" };
		String person[] = { "Men", "Women", "Kids" };

		for (int i = 0; i < 3; i++) {
			flipflop = new Fashion.FashionBuilder(person[i] + " Flipflop", 480).setBrand(brand[i])
					.setColour(color[i % 2])
					.setDescription(person[i] + " " + color[i % 2] + " Typography Print Sliders").setPerson(person[i])
					.setSize(size[i]).setCatagory("Flipflop").getNewFashion();
			ProductManager.getInstance().addProducts(flipflop);

			flipflop = new Fashion.FashionBuilder(person[i] + " Flipflop", 1180).setBrand(brand[i])
					.setColour(color[i % 2])
					.setDescription(person[i] + " " + color[i % 2] + " Unisex Seasonal Printed Clogs")
					.setPerson(person[i]).setSize(size[i]).setCatagory("Flipflop").getNewFashion();
			ProductManager.getInstance().addProducts(flipflop);

		}

	}

	private void loadSandals() {

		FashionProduct sandals = null;
		String color[] = { "Grey & Black", "Black" };
		String size[] = { "42", "44", "48" };
		String brand[] = { "adidas", "crocs", "woodland" };
		String person[] = { "Men", "Women", "Kids" };
		for (int i = 0; i < 3; i++) {
			sandals = new Fashion.FashionBuilder(person[i] + " Sandals", 1180).setBrand(brand[i])
					.setColour(color[i % 2]).setDescription(person[i] + " " + color[i % 2] + " Relay MU Sports Sandals")
					.setPerson(person[i]).setSize(size[i]).setCatagory("Sandals").getNewFashion();
			ProductManager.getInstance().addProducts(sandals);

			sandals = new Fashion.FashionBuilder(person[i] + " Sandals", 780).setBrand(brand[i]).setColour(color[i % 2])
					.setDescription(person[i] + " " + color[i % 2] + " ULTRA FLEX NEON STAR Sports Sandals")
					.setPerson(person[i]).setSize(size[i]).setCatagory("Sandals").getNewFashion();
			ProductManager.getInstance().addProducts(sandals);

		}
	}

	private void loadShoe() {

		FashionProduct shoe = null;
		String brand[] = { "puma", "adidas", "nike" };
		String color[] = { "Grey & Black", "Black" };
		String size[] = { "42", "44", "48" };
		String person[] = { "Men", "Women", "Kids" };
		for (int i = 0; i < 3; i++) {
			shoe = new Fashion.FashionBuilder(person[i] + " Shoe", 2180).setBrand(brand[i]).setColour(color[i % 2])
					.setDescription(person[i] + " " + color[i % 2] + " Mesh Running Shoes").setPerson(person[i])
					.setSize(size[i]).setCatagory("Shoe").getNewFashion();
			ProductManager.getInstance().addProducts(shoe);

			shoe = new Fashion.FashionBuilder(person[i] + " Shoe", 2180).setBrand(brand[i]).setColour(color[i % 2])
					.setDescription(person[i] + " " + color[i % 2] + " Semiformal Shoes").setPerson(person[i])
					.setSize(size[i]).setCatagory("Shoe").getNewFashion();
			ProductManager.getInstance().addProducts(shoe);
		}

	}

	private void loadTshirt() {

		FashionProduct tshirt;
		String s[] = { "XL", "L" };
		String colour[] = { "pink", "Army green mate" };
		String person[] = { "Men", "Women", "Kids" };
		for (int i = 0; i < 3; i++) {
			tshirt = new Fashion.FashionBuilder(person[i] + " Tshirt", 350).setPerson(person[i])
					.setDescription("Dnmx " + s[i % 2] + " " + colour[i % 2] + "Color Block " + person[i]
							+ " Round Neck T-Shirt")
					.setCatagory("tshirt").setSize(s[i % 2]).setColour(colour[i % 2]).setBrand("Dnmx")
					.getNewFashion();

			ProductManager.getInstance().addProducts(tshirt);

			tshirt = new Fashion.FashionBuilder(person[i] + " Tshirt", 440).setPerson(person[i])
					.setDescription("Dnmx " + s[i % 2] + " " + colour[i % 2] + "Color Block " + person[i]
							+ " Colar Neck T-Shirt")
					.setCatagory("tshirt").setSize(s[i % 2]).setColour(colour[i % 2]).setBrand("Dnmx")
					.getNewFashion();
			ProductManager.getInstance().addProducts(tshirt);
		}
	}

	private void loadWinterWear() {

		FashionProduct winterWear = null;
		String s[] = { "XL", "L" };
		String person[] = { "Men", "Women", "Kids" };
		String colour[] = { "light blue", "Black" };
		String brand[] = { "Altheroy ", "H&M ", "HIGH LANDER"

		};
		for (int i = 0; i < 3; i++) {
			winterWear = new Fashion.FashionBuilder("Winterwear " + person[i] + " Hoodie", 950).setPerson(person[i])
					.setSize(s[i % 2]).setColour(colour[i % 2])
					.setDescription(
							brand[i] + s[i % 2] + " " + colour[i % 2] + " Slim Fit Hoodie with Kangaroo Pocket ")
					.setBrand(brand[i]).setCatagory("Hoodie").getNewFashion();
			ProductManager.getInstance().addProducts(winterWear);

			winterWear = new Fashion.FashionBuilder("Winterwear " + person[i] + " Hoodie", 950).setPerson(person[i])
					.setSize(s[i % 2]).setColour(colour[i % 2])
					.setDescription(
							brand[i] + s[i % 2] + " " + colour[i % 2] + " Slim Fit Hoodie with Kangaroo Pocket ")
					.setBrand(brand[i]).setCatagory("Hoodie").getNewFashion();
			ProductManager.getInstance().addProducts(winterWear);

			winterWear = new Fashion.FashionBuilder("Winterwear " + person[i] + " Hoodie", 850).setPerson(person[i])
					.setSize(s[i % 2]).setColour(colour[i % 2])
					.setDescription(brand[i] + s[i % 2] + " " + colour[i % 2] + " Relaxed Fit Hoodie ")
					.setBrand(brand[i]).setCatagory("Hoodie").getNewFashion();
			ProductManager.getInstance().addProducts(winterWear);

			winterWear = new Fashion.FashionBuilder("Winterwear " + person[i] + " Sweatshirts", 750)
					.setPerson(person[i]).setSize(s[i % 2]).setColour(colour[i % 2])
					.setDescription(brand[i] + s[i % 2] + " " + colour[i % 2] + " Solid Hooded Sweatshirt ")
					.setBrand(brand[i]).setCatagory("Sweatshirt").getNewFashion();
			ProductManager.getInstance().addProducts(winterWear);

			winterWear = new Fashion.FashionBuilder("Winterwear " + person[i] + " Sweatshirts", 750)
					.setPerson(person[i]).setSize(s[i % 2]).setColour(colour[i % 2])
					.setDescription(
							brand[i] + s[i % 2] + " " + colour[i % 2] + " Slim Fit Hoodie with Kangaroo Pocket ")
					.setBrand(brand[i]).setCatagory("Sweatshirt").getNewFashion();
			ProductManager.getInstance().addProducts(winterWear);

		}
	}

	private void loadSarees() {

		FashionProduct saree = null;
		String[] colour = { "(Maroon, Black)", "(Orange)" };
		String[] catagory = { "Pure Silk", "Silk", "Cotton Blend" };
		String brand[] = { "Fabwomen", "Cartyshop", "Saraa" };
		String description[] = {

				"Embroidered Fashion Lycra Saree ", "Printed Mysore Art Saree",
				"Floral Print, Printed Kanjivaram  Saree "

		};

		for (int i = 0; i < 3; i++) {

			saree = new Fashion.FashionBuilder("Saree", 820).setPerson("Women").setDescription(description[i])
					.setColour(colour[i % 2]).setSize("L").setBrand(brand[i]).setCatagory(catagory[i]).getNewFashion();
			ProductManager.getInstance().addProducts(saree);

			saree = new Fashion.FashionBuilder("Saree", 520).setPerson("Women").setDescription(description[i])
					.setColour(colour[i % 2]).setSize("L").setBrand(brand[i]).setCatagory(catagory[i]).getNewFashion();
			ProductManager.getInstance().addProducts(saree);

			saree = new Fashion.FashionBuilder("Saree", 780).setPerson("Women").setDescription(description[i])
					.setColour(colour[i % 2]).setSize("L").setBrand(brand[i]).setCatagory(catagory[i]).getNewFashion();
			ProductManager.getInstance().addProducts(saree);

		}
	}

	private void loadPant() {

		FashionProduct pant;
		String s[] = { "XL", "L" };
		String colour[] = { "Blue", "black" };
		String person[] = { "Men", "Women", "Kids" };
		for (int i = 0; i < 3; i++) {

			pant = new Fashion.FashionBuilder("Men jeans Pant", 1100).setPerson(person[i])
					.setDescription("Dnmx   " + s[i % 2] + " " + colour[i % 2] + "  Flexi Slim Men Dark Blue formal")
					.setColour(colour[i % 2]).setSize(s[i % 2]).setBrand("Dnmx").setCatagory("Formal").getNewFashion();
			ProductManager.getInstance().addProducts(pant);

			pant = new Fashion.FashionBuilder("Men Formal Pant", 800).setPerson(person[i])
					.setDescription("Arrows  " + s[i % 2] + " " + colour[i % 2] + "  Slim Fit Flat-Front Trousers")
					.setColour(colour[i % 2]).setSize(s[i % 2]).setBrand("Arrows").setCatagory("Jeans").getNewFashion();
			ProductManager.getInstance().addProducts(pant);

		}

	}

	private void loadShirts() {

		String s[] = { "XL", "L" };
		String colour[] = { "blue", "dark grey" };
		String person[] = { "Men", "Women", "Kids" };
		FashionProduct shirt = null;

		for (int i = 0; i < 3; i++) {

			shirt = new Fashion.FashionBuilder(person[i] + " Shirts", 1100).setPerson(person[i])
					.setDescription("Johnplayers  " + s[i % 2] + " " + colour[i % 2] + " " + person[i] + "  "
							+ colour[i % 2] + "Slim Fit Printed Spread Collar Formal Shirt")
					.setBrand("Johnplayers").setCatagory("shirt").setColour(colour[i % 2]).setSize(s[i % 2])
					.getNewFashion();
			ProductManager.getInstance().addProducts(shirt);

			shirt = new Fashion.FashionBuilder(person[i] + " Shirt", 800).setPerson(person[i])
					.setDescription("Netplay  " + s[i % 2] + " " + colour[i % 2] + " " + person[i]
							+ " Regular Fit Solid Spread Collar Casual Shirt")
					.setBrand("Netplay").setCatagory("shirt").setColour(colour[i % 2]).setSize(s[i % 2])
					.getNewFashion();
			ProductManager.getInstance().addProducts(shirt);
			
			shirt = new Fashion.FashionBuilder(person[i] + " Shirt", 800).setPerson(person[i])
					.setDescription("Netplay  " + s[i % 2] + " " + colour[i % 2] + " " + person[i]
							+ " Regular Fit Solid Spread Collar Casual Shirt")
					.setBrand("Netplay").setCatagory("shirt").setColour(colour[i % 2]).setSize(s[i % 2])
					.getNewFashion();
			ProductManager.getInstance().addProducts(shirt);

		}

	}

	public static FashionStore getInstance() {
		return fashionStore;
	}

}
