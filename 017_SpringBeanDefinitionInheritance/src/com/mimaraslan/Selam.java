package com.mimaraslan;

public class Selam {

	private String mesaj1, mesaj2;

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

	public void goster(){
	System.out.println(getMesaj1() +"\n"+ getMesaj2());
	}
}

