package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Merkez {
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext(
				"SpringBeansConfig.xml");

		Koleksiyonlar koleksiyonlar; 
		koleksiyonlar= appCtx.getBean("BeanKoleksiyonlar", Koleksiyonlar.class);
		
		System.out.println(koleksiyonlar);
		
		((ConfigurableApplicationContext)appCtx).close(); 							
	}
}