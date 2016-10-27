package com.mimaraslan;

public class Calisan {
	
	private String adi, soyadi;
	private Adres adres;
// ----------------------------
	@Override
	public String toString() {
		return "ÇALIŞANIN " + getAdres();
	}
// ----------------------------
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
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