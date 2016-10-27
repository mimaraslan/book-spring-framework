package com.mimaraslan.dao;

import java.util.List;

import com.mimaraslan.enterprise.Personel;

public interface PersonelDAO {
	
		public void ekle(Personel personel);
		
		public Personel idAra(int id);
		public Personel adiAra(String adi);
		public Personel soyadiAra(String soyadi);
		public Personel tecrubeyeAra(int tecrube);
		
		public List<Personel> butunKayitlariAra(); 						
		public String idDegeriyleStringBirVeriyiCekme(int id);	
		
public void topluVerisiGirisiBatch1(final List<Personel> personel);  
public void topluVerisiGirisiBatch2(final String sql);  

}



























