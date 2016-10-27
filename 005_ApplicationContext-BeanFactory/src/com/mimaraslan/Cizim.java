package com.mimaraslan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import 
org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cizim {

 public static void main(String[] args) {		      		
	
 ApplicationContext context = new ClassPathXmlApplicationContext(           
	new String[] {"spring.xml"});  

	BeanFactory beanFactory = context;  
	
  Ucgen ucgen= (Ucgen) beanFactory.getBean("ucgen");
  ucgen.ciz(); 
		                                      
 }
}




