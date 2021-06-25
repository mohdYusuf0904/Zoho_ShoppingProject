package com.eshopping.product.entities;

import com.eshopping.product.ElectronicProduct;

public class Electronics implements ElectronicProduct {

	private String person;
	private String name;
	private double price;
	private String description;
	private String brand;
	private String boxDetails;
	private String additionalDetails;
	private String warrrantyDetails;


	public Electronics(ElectronicBuilder builder)
	{
		this.person = builder.person;
		this.name = builder.name;
		this.price = builder.price;
		this.description = builder.description;
		this.brand = builder.brand;
		this.boxDetails = builder.boxDetails;
		this.additionalDetails = builder.additionalDetails;
		this.warrrantyDetails = builder.warrrantyDetails;
	
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
	
	public String getBoxDetails() {
		return boxDetails;
	}
	public String getAdditionalDetails() {
		return additionalDetails;
	}
	public String getWarrantyDetails() {
		return warrrantyDetails;
	}

	
	public static class ElectronicBuilder{
		

		private String person;
		private String name;
		private double price;
		private String description;
		private String brand;
		private String boxDetails;
		private String additionalDetails;
		private String warrrantyDetails;

		
		public ElectronicBuilder(String name,double price) {
			
			this.name=name;
			this.price=price;
		}
		
		public ElectronicBuilder setPerson(String person) {
			this.person = person;
			return this;
		}
		public ElectronicBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public ElectronicBuilder setPrice(double price) {
			this.price = price;
			return this;
		}
		public ElectronicBuilder setDescription(String description) {
			this.description = description;
			return this;
		}
		public ElectronicBuilder setBrand(String brand) {
			this.brand = brand;
			return this;
		}
		
		public ElectronicBuilder setBoxDetails(String boxDetails) {
			this.boxDetails = boxDetails;
			return this;
		}
		public ElectronicBuilder setAdditionalDetails(String additionalDetails) {
			this.additionalDetails = additionalDetails;
			return this;
		}
		public ElectronicBuilder setWarrrantyDetails(String warrrantyDetails) {
			this.warrrantyDetails = warrrantyDetails;
			return this;
		}

		public Electronics getElectronicInstance() {
			
			return new Electronics(this);
					
		}
		
	}
	
}
