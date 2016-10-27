package com.mimaraslan;

public class Ucgen {
//-------------------------------------	
	private String cesit;
//-------------------------------------	
   public Ucgen(String aaa) {                         
		this.cesit = aaa; 
	}                                                         
//-------------------------------------
	public void setCesit(String cesit) {                                
		this.cesit = cesit;
	}
	public String getCesit() {
		return cesit;
	}
//-------------------------------------
	public void ciz() {
		System.out.println(getCesit() + " Üçgen çiz."); 
	}
}

