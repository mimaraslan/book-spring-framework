package com.mimaraslan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kaynak {
	private Map<String, String> map;
	private List<String> list;
//------------------------
	public Kaynak() {
		map = new HashMap<String, String>();
		map.put("Hibernate", "Gökçe Yurdakul");
		map.put("Spring", "Sema Çakmakçı");
		map.put("Primefaces", "Ayşegül Bilgi");
 
		list = new ArrayList<String>();
		list.add("Seda Uysal");
		list.add("Burcu Topu");
		list.add("Nur Cinci");
	}
 //------------------------
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