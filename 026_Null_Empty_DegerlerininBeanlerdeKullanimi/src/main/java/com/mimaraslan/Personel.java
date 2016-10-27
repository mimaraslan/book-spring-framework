package com.mimaraslan;

public class Personel {

	String adi, soyadi, gorevi, telNo, adres;
	String anneAdi, babaAdi;
	int dogumYili, maasi;
	boolean ehliyet, medeniHali;
//-----------------------------	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
//-----------------------------	
	public boolean isMedeniHali() {
		return medeniHali;
	}
	public void setMedeniHali(boolean medeniHali) {
		this.medeniHali = medeniHali;
	}
//-----------------------------	
	public int getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
//-----------------------------		
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
//-----------------------------	
	public String getGorevi() {
		return gorevi;
	}
	public void setGorevi(String gorevi) {
		this.gorevi = gorevi;
	}

//-----------------------------	
	public int getMaasi() {
		return maasi;
	}
	public void setMaasi(int maasi) {
		this.maasi = maasi;
	}
//-----------------------------	
	public boolean isEhliyet() {
		return ehliyet;
	}
	public void setEhliyet(boolean ehliyet) {
		this.ehliyet = ehliyet;
	}

	//-----------------------------		
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	//-----------------------------		
	public String getAnneAdi() {
		return anneAdi;
	}
	public void setAnneAdi(String anneAdi) {
		this.anneAdi = anneAdi;
	}
	//-----------------------------		
	public String getBabaAdi() {
		return babaAdi;
	}
	public void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}
	//-----------------------------		
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
}