package com.mimaraslan;

public class Calisan {
	
	private String adi, soyadi;
	private Adres adres;
// ----------------------------	
	public Calisan() {                                                              
		System.out.println("Parametresiz hazırlayıcı");
		}
	
	public Calisan(Adres adres) {
		System.out.println("Parametreli hazırlayıcı");
		this.adres = adres;
	}
// ----------------------------
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
// ----------------------------
	@Override
	public String toString() {
		return "ÇALIŞAN : " + getAdi()+ " " + getSoyadi() 
				+ "\n" + getAdres();
	}
// ----------------------------
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
// ----------------------------
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

}