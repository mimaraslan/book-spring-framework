package com.mimaraslan.aop;

import org.springframework.aop.ThrowsAdvice;

public class MetotCagiriIstisnaSonrasiYapilacaklar implements ThrowsAdvice {				
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {    			
	    System.out.println("---Spring AOP ile "
	     		 + "metotlardaki bir İSTİSNADAN SONRA "
	     		 + "çalışan afterThrowing metodu.---\n");	
	}
}