package com.mimaraslan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MetotCagiriSonrasiYapilacaklar {
	
	@After("execution(* com.mimaraslan.IPersonelServis.selamVer(..))")
	public void sonGorev(JoinPoint joinPoint) {                       		   				      

	    System.out.println("--- AspectJ --- "
	    + joinPoint.getSignature().getName() + " isimli metottan"
	    		+ " SONRA çalışan sonGorev() metodu.\n" );	 
	}
}

