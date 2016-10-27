package com.mimaraslan.aop;

import java.util.Arrays;
import org.aspectj.lang.ProceedingJoinPoint; 
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;

//@Aspect
public class CagirilanMetodunOncesiVeSonrasiOzellikleri {
	
/*	@Around("execution(* "														
			+ "com.mimaraslan.IPersonelServis."
			+ "adiSoyadiKontrolEt(..))") */
public void secilenMetoduSar(ProceedingJoinPoint joinPoint) 
			throws Throwable {

	 System.out.println("\n### AOP <aop:around> XML ETİKETİ ### "
	+ joinPoint.getSignature().getName() + " metodundan"
	    		+ " ÖNCEKİ çalışan metot." );	 
	
	   
	System.out.println("### AOP <aop:around> XML ETİKETİ ### "
			+ "Çağırılan metodun argumentleri  : "
	+ Arrays.toString(joinPoint.getArgs()));

	// proceed, normal sıradan bir metot çağırımıdır.
	// @Around içinde belirtilen metodu çağırır.
	joinPoint.proceed(); 
	   
    System.out.println("### AOP <aop:around> XML ETİKETİ ### "
     + joinPoint.getSignature().getName() + " metodundan"
    	    		+ " SONRAKİ çalışan metot.\n" );
	} 
}




















