package com.mimaraslan;

import java.util.Map;											

public class Sehir {

	private Map<?, ?> mapimiz;								
//---------------------------
	public Map<?, ?> getMapimiz() {
		return mapimiz;
	}
	public void setMapimiz(Map<?, ?> mapimiz) {
		this.mapimiz = mapimiz;
	}
//---------------------------
	@Override
	public String toString() {
		return "ŞEHİRLER : " + mapimiz;
	}
}