package com.mimaraslan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {	
	
	//@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext appCtx = 
			  new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

		 Ogrenci ogrenci= appCtx.getBean("beanOgrenci",Ogrenci.class);

		 ogrenci.getOgrenciList();
		 ogrenci.getOgrenciSet();
		 ogrenci.getOgrenciMap();
		 ogrenci.getOgrenciProp();       

		// ((AbstractApplicationContext)appCtx).registerShutdownHook();
		   ((ConfigurableApplicationContext)appCtx).close();                                  
	}
}


