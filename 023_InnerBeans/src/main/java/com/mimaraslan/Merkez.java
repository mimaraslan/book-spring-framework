package com.mimaraslan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = 
			  new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

	       Musteri musteri = (Musteri) context.getBean("beanMusteri");

	       musteri.hesabiOde();          

	}
}


