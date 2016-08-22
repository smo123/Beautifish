package com.beautifish.models;

import java.io.Serializable;

public class OutMoney implements Serializable {
	public static final String TAG = OutMoney.class.getSimpleName();
	private static final long serialVersionUID = 2613195906702234783L;

	private String money_id;
	private String applicant_uid;
	private String applicant_uname;
	private String applicant_phone;
	private String applicant_wechat;
	private String applicant_alipay;
	private String applicant_qq;
	private String money_amount;
	private String apply_time;
	private String handle_time;
	private String handler;
	private String status_code;
	private String status_msg;
	
	public String getMoney_id() {
		return money_id;
	}
	public void setMoney_id(String money_id) {
		this.money_id = money_id;
	}
	public String getApplicant_uid() {
		return applicant_uid;
	}
	public void setApplicant_uid(String applicant_uid) {
		this.applicant_uid = applicant_uid;
	}
	public String getApplicant_uname() {
		return applicant_uname;
	}
	public void setApplicant_uname(String applicant_uname) {
		this.applicant_uname = applicant_uname;
	}
	public String getApplicant_phone() {
		return applicant_phone;
	}
	public void setApplicant_phone(String applicant_phone) {
		this.applicant_phone = applicant_phone;
	}
	public String getApplicant_wechat() {
		return applicant_wechat;
	}
	public void setApplicant_wechat(String applicant_wechat) {
		this.applicant_wechat = applicant_wechat;
	}
	public String getApplicant_alipay() {
		return applicant_alipay;
	}
	public void setApplicant_alipay(String applicant_alipay) {
		this.applicant_alipay = applicant_alipay;
	}
	public String getApplicant_qq() {
		return applicant_qq;
	}
	public void setApplicant_qq(String applicant_qq) {
		this.applicant_qq = applicant_qq;
	}
	public String getMoney_amount() {
		return money_amount;
	}
	public void setMoney_amount(String money_amount) {
		this.money_amount = money_amount;
	}
	public String getApply_time() {
		return apply_time;
	}
	public void setApply_time(String apply_time) {
		this.apply_time = apply_time;
	}
	public String getHandle_time() {
		return handle_time;
	}
	public void setHandle_time(String handle_time) {
		this.handle_time = handle_time;
	}
	public String getHandler() {
		return handler;
	}
	public void setHandler(String handler) {
		this.handler = handler;
	}
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public String getStatus_msg() {
		return status_msg;
	}
	public void setStatus_msg(String status_msg) {
		this.status_msg = status_msg;
	}
	
}
