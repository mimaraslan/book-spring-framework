package com.mimaraslan;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Merkez {
   public static void main(String[] args) {
	   
 ConfigurableApplicationContext context = 
 new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
  
    context.start(); // context ayağa kaldırılıyor
	  
	 Sozler sozler=context.getBean("sozlerBean",Sozler.class);
	
	 sozler.ekranaYaz();
	 
	 CustomOlayYayinlayicisi olayYayinlayicisi = 
				 context.getBean("customOlayYayinlayicisiBean", 
						 		  CustomOlayYayinlayicisi.class);
	 
		 olayYayinlayicisi.yayinla();  
		 olayYayinlayicisi.yayinla();
		 olayYayinlayicisi.yayinla();  
     
    context.stop(); // context durduruluyor.
      
    context.close(); // context kapatılıyor.
   }
}









