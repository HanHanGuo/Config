package com.xianguo.config;

import java.util.ResourceBundle;

import lombok.Data;

@Data
public class PropertiesUtil {
	private String path = "";
	
	private ResourceBundle res;
	
	public ResourceBundle getResource() {
		if(res == null) {
			 res = ResourceBundle.getBundle(path);
		}
		return res;
	}
}
