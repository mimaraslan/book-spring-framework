package com.mimaraslan;

import java.util.Properties;															

public class Ayar {

	Properties properties;
//---------------------------
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

//---------------------------
	@Override
	public String toString() {
		return "SONUÇ : " + properties;
	}
//---------------------------	
	public void sonucuYaz() {
		System.out.println(properties.toString());
	}
//---------------------------	
}
