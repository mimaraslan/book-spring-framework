package com.mimaraslan.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
 
public class MetotCagiriOncesiYapilacaklar implements MethodBeforeAdvice							
{
	@Override
	public void before(Method method, Object[] args, Object target)
	  throws Throwable {
	     System.out.println("---Spring AOP ile "
	     		 + "her metottan ÖNCE devreye giren before metodu.---");	        
	  }
}