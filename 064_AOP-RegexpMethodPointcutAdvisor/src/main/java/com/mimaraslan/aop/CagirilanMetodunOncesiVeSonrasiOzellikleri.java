package com.mimaraslan.aop;

import java.util.Arrays;
 
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri 
								implements MethodInterceptor {								
	
	public Object invoke(MethodInvocation methodInvocation) 
											throws Throwable {
 
		// Aynı before metodu gibidir.
		System.out.println("****Çağırılan metodun ÖNCEKİ dururmu.\n");
		
		System.out.println("****Çağırılan metodun adı : "
				+ methodInvocation.getMethod().getName());
		
		System.out.println("****Çağırılan metodun argumentleri : "
				+ Arrays.toString(methodInvocation.getArguments()));
	
		
		try {
			// proceed, normal sıradan bir metot çağırımıdır. 
			Object result = methodInvocation.proceed();
			// Aynı AfterReturning metodu gibidir.
			System.out.println("****Çağırılan metodun SONRAKİ dururmu.");
			return result;
 
		} catch (IllegalArgumentException e) {
			// Aynı AfterThrowing metodu gibidir.
			System.out.println("****Çağırılan metota İSTİSNA "
											+ "meydana gelme dururmu.");
			throw e;
		}
	}
}










