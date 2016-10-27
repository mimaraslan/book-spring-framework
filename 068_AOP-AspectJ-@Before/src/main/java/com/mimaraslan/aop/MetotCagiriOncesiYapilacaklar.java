package com.mimaraslan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MetotCagiriOncesiYapilacaklar {
	
	@Before("execution(* com.mimaraslan.IPersonelServis.selamVer(..))")
	public void ilkGorev(JoinPoint joinPoint) {                       		   				      

	    System.out.println("--- AOP <aop:before> XML ETİKETİ --- "
	    + joinPoint.getSignature().getName() + " isimli metottan"
	    		+ " ÖNCE çalışan ilkGorev() metodu." );	 
	}
}






























