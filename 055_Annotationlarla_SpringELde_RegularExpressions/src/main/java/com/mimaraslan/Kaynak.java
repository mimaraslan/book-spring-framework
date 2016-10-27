package com.mimaraslan;
import java.util.*;
import org.springframework.stereotype.Component;

@Component("kaynakBean")												
public class Kaynak {
	
	private Map<String, String> map;
	private List<String> list;
	private String eposta;
//------------------------
	public Kaynak() {
		eposta = "mimaraslan@yandex.ru";
		
		map = new HashMap<String, String>();
 		map.put("Macit Karaman","bysoul37@facebook.com");
		map.put("Adnan Aydemir","adnan.aydemir.37@facebook.com");
		map.put("Bahtiyar Dilek", "bahtiyar.dilek@facebook.com");
		map.put("Hakan Keten","ketenhakan.hk@gmail.com");
		map.put("Hamit Ayvacı","hamit@isdunyasindabendevarim.com");

		list = new ArrayList<String>();
		list.add("Macit Karaman");
		list.add("Adnan Aydemir");
		list.add("Bahtiyar Dilek");
		list.add("Hakan Keten");
		list.add("Hamit Ayvacı");
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