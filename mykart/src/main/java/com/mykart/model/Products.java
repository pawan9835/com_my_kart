package com.mykart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Products {
	
	@Id
	private int productID;
	private String productName;
	private String product_description;
	private String product_categorie;
	private String productType;
	private int productQuantity;
	private double productPrice;
	
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Products [productID=" + productID + ", productName=" + productName + ", productType=" + productType
				+ ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + "]";
	}
	

	
}
