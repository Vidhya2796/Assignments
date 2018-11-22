package com.sasi.junit;

public class Product {
	
	private String productName;
	private double productPrice;

	public Product(String ProductName, double productPrice) {
		this.productName = ProductName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public boolean equals(Object o) {
		if (o instanceof Product) {
			Product p = (Product) o;
			return p.getProductName().equals(productName);
		}
		return false;

	}

}
