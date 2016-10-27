package com.mimaraslan.musteri;

public class Musteri {

	public Musteri() {
		System.out.println("Müşteri Sınıfı");
	}
//-----------------------------------		
	String adi, soyadi, telNo;
	Adres adres;														
//-----------------------------	
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
//-----------------------------	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
//-----------------------------		
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
//-----------------------------		
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
}