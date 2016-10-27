package com.mimaraslan;

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
    
	Personel personel = null;
	
	System.out.println("\n --- NESNEYİ VERİTABANINA KAYDETTİRME");	  
	personel = new Personel("Utku", "Kutlu", 9);
	personelDAO.ekle(personel);
	System.out.println(personel);
	
    System.out.println("\n --- id NUMARASI İLE YAPILAN ARAMA");
    personel = personelDAO.idAra(3);
    System.out.println(personel);
    
    System.out.println("\n --- adi DEĞERİ İLE YAPILAN ARAMA");
    personel = personelDAO.adiAra("Yunus");   
    System.out.println(personel);
    
    System.out.println("\n --- id DEĞERİ İLE String BİR VERİYİ ÇEKME");
    String gelen = personelDAO.idDegeriyleStringBirVeriyiCekme(1);
    System.out.println(gelen);  
   
    System.out.println("\n --- BÜTÜN KAYITLARI GETİREN ARAMA");
    for (Personel kayit : personelDAO.butunKayitlariAra()){
        System.out.println(kayit + "-----------------");
    }
 
  context.close();
  }
}







































































