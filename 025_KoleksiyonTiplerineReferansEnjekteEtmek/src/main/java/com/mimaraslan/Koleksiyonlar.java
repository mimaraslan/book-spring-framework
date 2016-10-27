package com.mimaraslan;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Koleksiyonlar {

	private List<Object> listler;
	private Set<Object> setler;
	private Map<Object, Object> mapler;
	private Properties propertiesler;
//----------------------------------------
	public List<Object> getListler() {
		return listler;
	}
	public void setListler(List<Object> listler) {
		this.listler = listler;
	}
//----------------------------------------
	public Set<Object> getSetler() {
		return setler;
	}
	public void setSetler(Set<Object> setler) {
		this.setler = setler;
	}
//----------------------------------------
	public Map<Object, Object> getMapler() {
		return mapler;
	}
	public void setMapler(Map<Object, Object> mapler) {
		this.mapler = mapler;
	}
//----------------------------------------
	public Properties getPropertiesler() {
		return propertiesler;
	}
	public void setPropertiesler(Properties propertiesler) {
		this.propertiesler = propertiesler;
	}
//----------------------------------------
	@Override
	public String toString() {                                  			                     
		return     " List =" + listler 
				+ "\n Set =" + setler 
				+ "\n Map =" + mapler
				+ "\n Properties =" + propertiesler;
	}
}











