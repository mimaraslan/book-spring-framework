package com.mimaraslan;

public class TernaryOperator {

	private boolean kontrol;
//---------------------------
	public boolean isKontrol() {
		return kontrol;
	}	
	public void setKontrol(boolean kontrol) {
		this.kontrol = kontrol;
	}
//---------------------------	
	@Override
	public String toString(){																								
		return "TernaryOperator kontrol sonucu : " + kontrol;
	}
}

