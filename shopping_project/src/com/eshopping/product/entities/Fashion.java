package com.eshopping.product.entities;

import com.eshopping.product.FashionProduct;

public class Fashion extends FashionProduct {

	private String person;
	private String name;
	private double price;
	private String description;
	private String brand;
	private String catagory;
	private String sizeAvailable;
	private String colour;

	public Fashion(FashionBuilder fashionBuilder) {

		this.person = fashionBuilder.person;
		this.name = fashionBuilder.name;
		this.price = fashionBuilder.price;
		this.description = fashionBuilder.description;
		this.brand = fashionBuilder.brand;
		this.catagory = fashionBuilder.catagory;
		this.sizeAvailable = fashionBuilder.sizeAvailable;
		this.colour = fashionBuilder.colour;

	}

	public String getPerson() {
		return person;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public String getBrand() {
		return brand;
	}

	public String getCatagory() {
		return catagory;
	}

	public String getSize() {

		return sizeAvailable;
	}

	public String getColour() {

		return colour;
	}

	public static class FashionBuilder {

		private String person;
		private String name;
		private double price;
		private String description;
		private String brand;
		private String catagory;
		private String sizeAvailable;
		private String colour;

		public FashionBuilder(String name, double price) {
			this.name = name;
			this.price = price;

		}

		public FashionBuilder setDescription(String description) {
			this.description = description;
			return this;
		}

		public FashionBuilder setPerson(String person) {
			this.person = person;
			return this;
		}

		public FashionBuilder setBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public FashionBuilder setCatagory(String catagory) {
			this.catagory = catagory;
			return this;
		}

		public FashionBuilder setSize(String sizeAvailable) {
			this.sizeAvailable = sizeAvailable;
			return this;
		}

		public FashionBuilder setColour(String colour) {
			this.colour = colour;
			return this;
		}

		public Fashion getNewFashion() {

			return new Fashion(this);
		}

	}

}
