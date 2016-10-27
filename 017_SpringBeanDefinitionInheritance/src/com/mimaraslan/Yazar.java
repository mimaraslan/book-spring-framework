package com.mimaraslan;

public class Yazar {

	private String mesaj1, mesaj2, mesaj3;

	public String getMesaj1() {
		return mesaj1;
	}
	public void setMesaj1(String mesaj1) {
		this.mesaj1 = mesaj1;
	}

	public String getMesaj2() {
		return mesaj2;
	}
	public void setMesaj2(String mesaj2) {
		this.mesaj2 = mesaj2;
	}

	public String getMesaj3() {
		return mesaj3;
	}
	public void setMesaj3(String mesaj3) {
		this.mesaj3 = mesaj3;
	}

	public void goster() {
		System.out.println(getMesaj1() +"\n"+ 
			  getMesaj2() +"\n"+ getMesaj3());
	}
}

