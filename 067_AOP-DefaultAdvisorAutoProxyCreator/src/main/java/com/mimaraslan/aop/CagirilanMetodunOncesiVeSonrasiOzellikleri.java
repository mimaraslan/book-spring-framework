package com.mimaraslan.aop;
import java.util.Arrays; 

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri 
								implements MethodInterceptor {								
	@Override
	public Object invoke(MethodInvocation methodInvocation) 
											throws Throwable {
		// Aynı before metodu gibidir.
		System.out.println("\n****Çağırılan metodun ÖNCEKİ dururmu.");
		
		System.out.println("****Çağırılan metodun adı : "
				+ methodInvocation.getMethod().getName());
		
		System.out.println("****Çağırılan metodun argumentleri : "
				+ Arrays.toString(methodInvocation.getArguments()));
			
	    try {
			// proceed, normal sıradan bir metot çağırımıdır. 
			Object result = methodInvocation.proceed();
			// Aynı AfterReturning metodu gibidir.
        System.out.println("****Çağırılan metodun SONRAKİ dururmu.\n");
			return result;
 
		   } catch (IllegalArgumentException e) {
			// Aynı AfterThrowing metodu gibidir.
		System.out.println("****Çağırılan metotta İSTİSNA "
										   + "meydana gelme dururmu.");
			throw e;
		}
	}
}



















