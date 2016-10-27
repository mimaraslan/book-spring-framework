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
    
	Personel personel = new Personel("Taner", "Erkan", 6);
    personelDAO.ekle(personel);
    
    personel = personelDAO.idAra(1);
    System.out.println(personel);
    
    personel = personelDAO.adiAra("Taner");   
    System.out.println(personel);
    
	context.close();
   }
}












































