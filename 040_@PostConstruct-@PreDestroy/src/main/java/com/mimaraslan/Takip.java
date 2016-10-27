package com.mimaraslan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Takip {
	private String mesaj;

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		System.out.println(mesaj
		+ "\n(Bediüzzaman Said Nursi Hazretleri)"); 							
		return mesaj;
	}

	@PostConstruct
	public void init() {
		System.out.println("init metodu.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy metodu.");
	}
}

