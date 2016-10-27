package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Merkez {
	public static void main(String[] args) {
		
		ApplicationContext appCtx; 
		appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Ayar ayar = appCtx.getBean("AyarBean", Ayar.class);                         					
		
		System.out.println(ayar);														
		
		ayar.sonucuYaz();		
		
		((ConfigurableApplicationContext)appCtx).close(); 							
	}
}



