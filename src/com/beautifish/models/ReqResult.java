package com.beautifish.models;

import java.io.Serializable;

public class ReqResult implements Serializable {
	public static final String TAG = ReqResult.class.getSimpleName();
	private static final long serialVersionUID = -1660471781452151646L;
	
	private String code;
	private String msg;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
