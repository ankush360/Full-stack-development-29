package com.ibm.training.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Component("productBean")
public class ProductBean {
	
	private int product_quantity;
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}


	private int product_code;
	private String product_name;
	private String product_description;
	private String product_category;
	private float product_price;
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getProduct_category() {
		return product_category;
	}
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	public float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	

	@Override
	public String toString() {
		return this.getProduct_code() + " "  + this.getProduct_category() + " "+this.getProduct_price(); 
	}
	
	
	
	
	
}
