package com.mimaraslan;

import java.util.*;												        

public class Ogrenci {
	List <?>    ogrenciList;
	Set  <?>    ogrenciSet;
	Map  <?, ?> ogrenciMap;
	Properties  ogrenciProp;
//-----------------------------------------------
	public void setOgrenciList(List<?> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}
	public List<?> getOgrenciList() {
		System.out.println("List Elemanları :" + ogrenciList);
		return ogrenciList;
	}
//-----------------------------------------------
	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
	public Set<?> getOgrenciSet() {
		System.out.println("Set Elemanları :" + ogrenciSet);
		return ogrenciSet;
	}
//-----------------------------------------------
	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
	public Map<?, ?> getOgrenciMap() {
		System.out.println("Map Elemanları :" + ogrenciMap);
		return ogrenciMap;
	}
//-----------------------------------------------
	public void setOgrenciProp(Properties ogrenciProp) {
		this.ogrenciProp = ogrenciProp;
	}
	public Properties getOgrenciProp() {
		System.out.println("Property Elemanları :" + ogrenciProp);
		return ogrenciProp;
	}
}






















