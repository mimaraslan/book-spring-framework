package com.mimaraslan;

public class Selam {

	private String mesaj;

	public String getMesaj() {
		return mesaj;
	}
	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	public void goster(){
	System.out.println(getMesaj());
	}
	
	public void init(){                                
	System.out.println("Bean baþlatýlýyor.");
	}
	public void destroy(){                                    
	System.out.println("Bean sonlandýrýlýyor.");
	}
}
