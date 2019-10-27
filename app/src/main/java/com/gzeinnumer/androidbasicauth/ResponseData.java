package com.gzeinnumer.androidbasicauth;

import com.google.gson.annotations.SerializedName;

public class ResponseData{

	@SerializedName("data")
	private String data;

	public void setData(String data){
		this.data = data;
	}

	public String getData(){
		return data;
	}
}