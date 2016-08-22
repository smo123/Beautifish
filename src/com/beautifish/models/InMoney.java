package com.beautifish.models;

import java.io.Serializable;

public class InMoney implements Serializable {
	public static final String TAG = InMoney.class.getSimpleName();
	private static final long serialVersionUID = -2838364315921668047L;

	private String money_id;
	private String from_uid;
	private String to_uid;
	private String money_amount;
	private String direct;
	private String in_money_time;
	private String is_open;
	
	public String getMoney_id() {
		return money_id;
	}
	public void setMoney_id(String money_id) {
		this.money_id = money_id;
	}
	public String getFrom_uid() {
		return from_uid;
	}
	public void setFrom_uid(String from_uid) {
		this.from_uid = from_uid;
	}
	public String getTo_uid() {
		return to_uid;
	}
	public void setTo_uid(String to_uid) {
		this.to_uid = to_uid;
	}
	public String getMoney_amount() {
		return money_amount;
	}
	public void setMoney_amount(String money_amount) {
		this.money_amount = money_amount;
	}
	public String getDirect() {
		return direct;
	}
	public void setDirect(String direct) {
		this.direct = direct;
	}
	public String getIn_money_time() {
		return in_money_time;
	}
	public void setIn_money_time(String in_money_time) {
		this.in_money_time = in_money_time;
	}
	public String getIs_open() {
		return is_open;
	}
	public void setIs_open(String is_open) {
		this.is_open = is_open;
	}
	
}
