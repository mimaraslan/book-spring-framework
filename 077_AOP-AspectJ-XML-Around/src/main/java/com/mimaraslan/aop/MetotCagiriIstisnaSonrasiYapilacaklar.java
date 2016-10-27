package com.mimaraslan.aop;
 	
import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;

 //@Aspect
 public class MetotCagiriIstisnaSonrasiYapilacaklar {
 	
 /*	 @AfterThrowing(																
 		      pointcut = "execution(* "
 + "com.mimaraslan.IPersonelServis.adiSoyadiKontrolEt(..))",
 		      throwing= "hata") */
 public void istisnadanSonrakiGorev(JoinPoint joinPoint, 
		 									  Throwable hata){                       		   				      

	    System.out.println("--- AOP <aop:after-throwing> "
	    		+ "XML ETİKETİ --- \n"
	    + joinPoint.getSignature().getName() + " metodun"
	    		+ " bir İSTİSNADAN SONRA"
	    		+ " çalışan metot." );	
	    
	   System.out.println(joinPoint.getSignature().getName() 
  + " metodunda meydana gelen \nistisna türü : " + hata +"\n");
 	}
 }

 

	
	 