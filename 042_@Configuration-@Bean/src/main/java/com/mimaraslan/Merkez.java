package com.mimaraslan;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.
					annotation.AnnotationConfigApplicationContext;
 
public class Merkez {
	public static void main(String[] args) {
		
    
      AnnotationConfigApplicationContext context 
      = new AnnotationConfigApplicationContext();									
	   
      context.register(SpringBeansConfig.class);
      context.refresh();

      Ogrenci ogrenci = context.getBean(Ogrenci.class);
      System.out.println(ogrenci.getSehir().getSehirAdi());
      System.out.println(ogrenci.getSehir().getPlakaNo());
		
		
	 ((ConfigurableApplicationContext)context).close(); 							
	}
}

             											
	      		




