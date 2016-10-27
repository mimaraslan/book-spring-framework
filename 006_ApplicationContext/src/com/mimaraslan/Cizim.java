package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import 
org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cizim {

 public static void main(String[] args) {		      		
	
  ApplicationContext applicationContext 
  = new ClassPathXmlApplicationContext("spring.xml"); 

  Ucgen ucgen= (Ucgen) applicationContext.getBean("ucgen");
  ucgen.ciz(); 
		                                      
 }
}


