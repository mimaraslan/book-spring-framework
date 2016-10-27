package com.mimaraslan.dao;

import com.mimaraslan.enterprise.Personel;

public interface PersonelDAO {

		public void ekle(Personel personel);
		
		public Personel idAra(int id);
		public Personel adiAra(String adi);
		public Personel soyadiAra(String soyadi);
		public Personel tecrubeyeAra(int tecrube);

}

