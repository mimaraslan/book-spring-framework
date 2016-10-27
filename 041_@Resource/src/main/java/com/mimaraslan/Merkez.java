package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Merkez {
	public static void main(String[] args) {
		
	 ApplicationContext context 
	 = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
	     
      Calisan calisan = context.getBean("calianBean", Calisan.class);   
      
      System.out.println(calisan.getSehir().getSehirAdi().toString());                											
	      		
	 ((ConfigurableApplicationContext)context).close(); 							
	}
}

             											
	      		




