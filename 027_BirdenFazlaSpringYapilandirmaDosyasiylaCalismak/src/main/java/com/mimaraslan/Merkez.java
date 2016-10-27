package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mimaraslan.musteri.Musteri;
 
public class Merkez {
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext(
				"SpringBeansTumModuller.xml");

		Musteri musteri = appCtx.getBean("BeanMusteri", Musteri.class);
		
		System.out.println(  " ADI    : " + musteri.getAdi()
						  +"\n SOYADI : " + musteri.getSoyadi()
						  +"\n ADRESİ : " + musteri.getAdres().getAdres() );         
		
		((ConfigurableApplicationContext)appCtx).close(); 							
	}
}



