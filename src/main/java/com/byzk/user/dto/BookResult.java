package com.byzk.user.dto;

public class BookResult {
	private int strues ; 
	private String msg ;
	private Object data ;
	public int getStrues() {
		return strues;
	}
	public void setStrues(int strues) {
		this.strues = strues;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "BookResult [strues=" + strues + ", msg=" + msg + ", data=" + data + "]";
	}
	
}
