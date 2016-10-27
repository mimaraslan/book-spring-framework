package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {
	

		ApplicationContext appCtx; 
		appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
	
		Calisan calisan = (Calisan) appCtx.getBean("calisan", Calisan.class);
		System.out.println(calisan);
		
		((ConfigurableApplicationContext)appCtx).close(); 
	}
} 