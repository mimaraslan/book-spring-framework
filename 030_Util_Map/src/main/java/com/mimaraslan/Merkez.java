package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Merkez {
	public static void main(String[] args) {
		ApplicationContext appCtx; 
		appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		Sehir sehir = appCtx.getBean("BeanSehir", Sehir.class);                         
		
		System.out.println(sehir);
		
		((ConfigurableApplicationContext)appCtx).close(); 							
	}
}



