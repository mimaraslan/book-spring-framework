package com.mimaraslan;

import javax.annotation.Resource;

public class Calisan {
	
	private Sehir sehir;
//-----------------------
	public Sehir getSehir() {
		return sehir;
	}
	
	@Resource(name="sehirBean")													
	public void setSehir(Sehir sehir) {
		this.sehir = sehir;
	}
}
 
