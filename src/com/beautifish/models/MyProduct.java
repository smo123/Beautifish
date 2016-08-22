package com.beautifish.models;

import java.io.Serializable;

public class MyProduct implements Serializable {
	public static final String TAG = MyProduct.class.getSimpleName();
	private static final long serialVersionUID = 8197483432469766731L;

	private String product_id;
	private String icon;
	private String title;
	private String description;
	private String price;
	private String sales;
	private String sale_price;
	private String is_sale;
	private String is_hot;
	private String is_recommend;
	private String uid;
	private String buy_time;
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	public String getSale_price() {
		return sale_price;
	}
	public void setSale_price(String sale_price) {
		this.sale_price = sale_price;
	}
	public String getIs_sale() {
		return is_sale;
	}
	public void setIs_sale(String is_sale) {
		this.is_sale = is_sale;
	}
	public String getIs_hot() {
		return is_hot;
	}
	public void setIs_hot(String is_hot) {
		this.is_hot = is_hot;
	}
	public String getIs_recommend() {
		return is_recommend;
	}
	public void setIs_recommend(String is_recommend) {
		this.is_recommend = is_recommend;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getBuy_time() {
		return buy_time;
	}
	public void setBuy_time(String buy_time) {
		this.buy_time = buy_time;
	}
	
}
