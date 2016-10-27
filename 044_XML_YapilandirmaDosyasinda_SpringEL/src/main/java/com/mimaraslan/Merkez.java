package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Merkez {
	public static void main(String[] args) {		
    
	  ApplicationContext context
	  = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

	  Yazar yazar = context.getBean("yazarBean", Yazar.class);        

System.out.println(" YAZAR : "+ yazar.getAdi() + " " + yazar.getSoyadi()  
				  	 + "\n KİTAP : " + yazar.getKitapAdi()   
				     + "\n ISBN  : " + yazar.getKitap().getEserISBN() ) ;                         

	  ((ConfigurableApplicationContext) context).close(); 							
	}
}

             											
	      		




