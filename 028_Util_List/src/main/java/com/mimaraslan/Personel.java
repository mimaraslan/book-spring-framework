package com.mimaraslan;

import java.util.List;

public class Personel {

	private List<?> listemiz;
//----------------------------------
	public List<?> getListemiz() {
		return listemiz;
	}
	public void setListemiz(List<?> listemiz) {
		this.listemiz = listemiz;
	}
//----------------------------------
	@Override
	public String toString() {
		return "PERSONELLER : " + listemiz;
	}
}

