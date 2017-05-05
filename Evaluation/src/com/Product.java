package com;

import java.util.ArrayList;

public class Product {
	private int productId;
	private String productName;
	private String productBrand;
	private ArrayList<ProductSupplier> productSuppliers;
	private double productPrice;
	private ArrayList<ProductComment> productComments;
	public Product(int productId, String productName, String productBrand, ArrayList<ProductSupplier> productSuppliers,
			double productPrice, ArrayList<ProductComment> productComments) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productSuppliers = productSuppliers;
		this.productPrice = productPrice;
		this.productComments = productComments;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public ArrayList<ProductSupplier> getProductSuppliers() {
		return productSuppliers;
	}
	public void setProductSuppliers(ArrayList<ProductSupplier> productSuppliers) {
		this.productSuppliers = productSuppliers;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public ArrayList<ProductComment> getProductComments() {
		return productComments;
	}
	public void setProductComments(ArrayList<ProductComment> productComments) {
		this.productComments = productComments;
	}
	@Override
	public String toString() {
		return "Product Id=" + productId + ", Product Name=" + productName + ", Product Brand=" + productBrand
				+ ", Product Suppliers=" + productSuppliers + ", Product Price=" + productPrice + ", Product Comments="
				+ productComments;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productBrand == null) ? 0 : productBrand.hashCode());
		result = prime * result + ((productComments == null) ? 0 : productComments.hashCode());
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(productPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productSuppliers == null) ? 0 : productSuppliers.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productBrand == null) {
			if (other.productBrand != null)
				return false;
		} else if (!productBrand.equals(other.productBrand))
			return false;
		if (productComments == null) {
			if (other.productComments != null)
				return false;
		} else if (!productComments.equals(other.productComments))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (Double.doubleToLongBits(productPrice) != Double.doubleToLongBits(other.productPrice))
			return false;
		if (productSuppliers == null) {
			if (other.productSuppliers != null)
				return false;
		} else if (!productSuppliers.equals(other.productSuppliers))
			return false;
		return true;
	}
	
	
}
