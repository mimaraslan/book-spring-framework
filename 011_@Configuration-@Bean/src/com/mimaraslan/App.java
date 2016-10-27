package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.
annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class App {

	@Bean(name="selam")
	public static void main(String[] args) {	    
	/*
	   ApplicationContext context 
	   = new ClassPathXmlApplicationContext("beans.xml");
	 */
	ApplicationContext context 
	= new AnnotationConfigApplicationContext(AppConfig.class);
	 ISelam obj = (ISelam) context.getBean("selam");
	  obj.mesajYaz("Güzel gören, güzel düþünür.\n" +
	  				   "Güzel düþünen, hayatýndan lezzet alýr.");	    
	}	
}


