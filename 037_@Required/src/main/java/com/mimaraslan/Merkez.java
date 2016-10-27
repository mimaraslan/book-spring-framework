package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Merkez {
	public static void main(String[] args) {
		
		ApplicationContext appCtx; 
		appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
			
		Ogrenci ogrenci = appCtx.getBean("ogrenciBean", Ogrenci.class);                         					
		
	    System.out.println("ADI    : " + ogrenci.getAdi() );
	    System.out.println("SOYADI : " + ogrenci.getSoyadi() );
	    System.out.println("YAŞI   : " + ogrenci.getYasi() );										
		
		((ConfigurableApplicationContext)appCtx).close(); 							
	}
}



