package com.mimaraslan;

public class Ogrenci {

	private String adi, soyadi;
	private int numarasi;
//--------------------------------------
	Okul univeristesi;										
//--------------------------------------
	public Okul getUniveristesi() {
		return univeristesi;
	}
	public void setUniveristesi(Okul univeristesi) {
		this.univeristesi = univeristesi;
	}
//--------------------------------------	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
//--------------------------------------	
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
//--------------------------------------
	public int getNumarasi() {
		return numarasi;
	}
	public void setNumarasi(int numarasi) {
		this.numarasi = numarasi;
	}
}

