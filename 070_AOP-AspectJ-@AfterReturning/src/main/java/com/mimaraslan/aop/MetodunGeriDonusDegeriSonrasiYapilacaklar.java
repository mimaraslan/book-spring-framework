package com.mimaraslan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetodunGeriDonusDegeriSonrasiYapilacaklar {
	
	 @AfterReturning(																
			 pointcut = "execution(* "
			 		+ "com.mimaraslan."
			 		+ "IPersonelServis."
			 		+ "selamVer(..))", returning= "sonuc")
	public void geriDonusSonrasiGorev(JoinPoint joinPoint, Object sonuc) {                      		   				      

	    System.out.println("\n--- AspectJ --- "
	    + joinPoint.getSignature().getName() + " metodun"
	    		+ " GERİ DÖNÜŞ DEĞERİNDEN SONRA"
	    		+ " çalışan metot." );	 
	   System.out.println(joinPoint.getSignature().getName() 
			   + " metodunun geri dönüş değeri : " + sonuc +"\n");

	} 
}

