package com.mimaraslan;

import java.util.ArrayList;
import java.util.List;

import com.mimaraslan.dao.PersonelDAO;
import com.mimaraslan.enterprise.Personel;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Merkez {
 public static void main(String[] args) { 
	 
ConfigurableApplicationContext context = 
 new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

PersonelDAO personelDAO 
	= context.getBean("personelDAOBean",PersonelDAO.class);					
  
Personel personel01 = new Personel("Sahil", "Huseynzade",3); 
Personel personel02 = new Personel("Cesur", "Tapan", 2);
Personel personel03 = new Personel("Necmi", "Açıkkyol", 6);
Personel personel04 = new Personel("Royal", "Lachinov", 5);
Personel personel05 = new Personel("Uğur", "Karadağ",  0);
Personel personel06 = new Personel("Osman", "Tüysüz", 2);
Personel personel07 = new Personel("Toygar", "Varlı", 1);
Personel personel08 = new Personel("Cafer", "Kayadibi", 0);     
Personel personel09 = new Personel("Ahmet", "Kaplan",  1);
Personel personel10 = new Personel("Yunus Emre", "Şahin",1);
	

List<Personel> personelListesi = new ArrayList<Personel>();								
		personelListesi.add(personel01);
		personelListesi.add(personel02);
		personelListesi.add(personel03);
		personelListesi.add(personel04);
		personelListesi.add(personel05);
		personelListesi.add(personel06);
		personelListesi.add(personel07);
		personelListesi.add(personel08);
		personelListesi.add(personel09);
		personelListesi.add(personel10);

				
System.out.println(" EKLENCEK LİSTE\n" + personelListesi);

System.out.println("\n\n***KAYIT ÖNCESİ BÜTÜN KAYITLAR\n" 
    + personelDAO.butunKayitlariAra());
   
    //LİSTEDEKİ KAYITLAR TABLOYA GİRİLİYOR
personelDAO.topluVerisiGirisiBatch1(personelListesi);					
 
System.out.println("\n\n***TOPLU VERİ GİRİŞİ VE BÜTÜN KAYITLAR\n" 
    + personelDAO.butunKayitlariAra());
    
   
  
//SORGUYA GÖRE YAPILAN GÜNCELLEME İŞLEMİ 
personelDAO.topluVerisiGirisiBatch2("UPDATE personel "
									+ "SET soyadi='Alpaslan' "
									+ "WHERE soyadi='Kaplan'");
    
System.out.println("\n\n***GÜNCELLEME İŞLEMİ VE BÜTÜN KAYITLAR\n" 
    + personelDAO.butunKayitlariAra());
    	 
     context.close();
  }
}







































































