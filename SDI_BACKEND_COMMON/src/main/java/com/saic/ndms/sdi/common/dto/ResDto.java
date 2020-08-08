package com.saic.ndms.sdi.common.dto;

import java.util.ArrayList;

public class ResDto<T> {
	
	private  ResponseDemoBean<T> data;
	
	private String message;
	
	private int state;


	public ResponseDemoBean<T> getData() {
		return data;
	}

	public void setData(ResponseDemoBean<T> data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
	
	

}
