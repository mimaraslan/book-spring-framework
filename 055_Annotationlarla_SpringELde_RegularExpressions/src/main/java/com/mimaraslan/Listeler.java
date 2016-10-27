package com.mimaraslan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("listelerBean")
public class Listeler {	
	
	@Value("#{kaynakBean.map['Hamit Ayvacı']}")					 
	private String mapElemani;
	
	@Value("#{kaynakBean.list[4]}")
	private String listElemani;;
//------------------------------
	@Override
	public String toString() {														 
	  return  "SEÇİLEN LIST ELEMANI = " + listElemani
	    + "\n\nSEÇİLEN MAP  ELEMANI = " + mapElemani ;
	}	
//------------------------------
	public String getMapElemani() {
		return mapElemani;
	}
	public void setMapElemani(String mapElemani) {
		this.mapElemani = mapElemani;
	}
//------------------------------
	public String getListElemani() {
		return listElemani;
	}
	public void setListElemani(String listElemani) {
		this.listElemani = listElemani;
	}
	
}