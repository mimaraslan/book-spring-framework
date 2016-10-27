package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.matematik.HesapMakinesi;
 
public class Merkez {
	public static void main(String[] args) {		
    
	  ApplicationContext context
	  = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

	  HesapMakinesi hesapMakinesi 
	  = context.getBean("hesapMakinesiBeanComponent", HesapMakinesi.class);        
		
	  hesapMakinesi.sonuclariGetir(571, 632);

	  ((ConfigurableApplicationContext) context).close(); 							
	}
}

             											
	      		




