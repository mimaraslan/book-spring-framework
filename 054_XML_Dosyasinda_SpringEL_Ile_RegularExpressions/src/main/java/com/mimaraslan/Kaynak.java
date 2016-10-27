package com.mimaraslan;
import java.util.*;

public class Kaynak {
	private Map<String, String> map;
	private List<String> list;
	private String eposta;
//------------------------
	public Kaynak() {
		eposta = "mimaraslan@yandex.ru";
		
		map = new HashMap<String, String>();
 		map.put("Mücahit Sidimi","msidimi@facebook.com");
		map.put("Adnan Aydemir","adnan.aydemir.37@facebook.com");
		map.put("Natiq Vahabov", "natiq.vahabov@facebook.com");
		map.put("Kocbiyik Enbiya","1461oflu@facebook.com");
		map.put("Utku Kutlu","utku.kutlu.104@facebook.com");

		list = new ArrayList<String>();
		list.add("Mücahit Sidimi");
		list.add("Adnan Aydemir");
		list.add("Natiq Vahabov");
		list.add("Kocbiyik Enbiya");
		list.add("Utku Kutlu");
	}
 //------------------------
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	} 
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}

}