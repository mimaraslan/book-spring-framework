package com.mimaraslan;

public class Calisan {
	String adi;
	String soyadi;
	int yasi;
	Adres adres;                                                            
//-------------------------------
   public Calisan(String adi, String soyadi, int yasi, Adres adres){
		this.adi = adi;
		this.soyadi = soyadi;
		this.yasi = yasi;
		this.adres = adres;
	}
 //-------------------------------
 	public Adres getAdres() {
 		return adres;
 	}
 	public void setAdres(Adres adres) {
 		this.adres = adres;
 	}
//-------------------------------	   
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
//-------------------------------	
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
//-------------------------------	
	public int getYasi() {
		return yasi;
	}
	public void setYasi(int yasi) {
		this.yasi = yasi;
	}
	
	

}
