package com.mimaraslan.aop;

import java.util.Arrays;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CagirilanMetodunOncesiVeSonrasiOzellikleri {
	
	@Around("execution(* "														
			+ "com.mimaraslan."
			+ "IPersonelServis."
			+ "adiSoyadiKontrolEt(..))")
public void secilenMetoduSar(ProceedingJoinPoint joinPoint) 
			throws Throwable {

	 System.out.println("\n### AspectJ ### "
	+ joinPoint.getSignature().getName() + " metodundan"
	    		+ " ÖNCEKİ çalışan metot." );	 
	
	   
	System.out.println("### AspectJ ### "
			+ "Çağırılan metodun argumentleri  : "
	+ Arrays.toString(joinPoint.getArgs()));

	// proceed, normal sıradan bir metot çağırımıdır.
	// @Around içinde belirtilen metodu çağırır.
	joinPoint.proceed(); 
	   
    System.out.println("### AspectJ ### "
     + joinPoint.getSignature().getName() + " metodundan"
    	    		+ " SONRAKİ çalışan metot.\n" );
	} 
}




















