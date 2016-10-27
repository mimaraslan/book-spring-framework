package com.mimaraslan.aop;
import java.util.Arrays;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
public class CagirilanMetodunOncesiVeSonrasiOzellikleri2 
									implements MethodInterceptor {					
	@Override
	public Object invoke(MethodInvocation methodInvocation) 
												throws Throwable {
 
		// Aynı MethodBeforeAdvice gibidir.
		System.out.println("### 2:"
				+ " Çağırılan metodun ÖNCEKİ dururmu.");
		
		System.out.println("### 2:"
				+ " Çağırılan metodun adı : "
				+ methodInvocation.getMethod().getName());
		
		System.out.println("### 2:"
			+ " Çağırılan metodun argumentleri : "
			+ Arrays.toString(methodInvocation.getArguments()));
			
 
	   try {
			// proceed, normal sıradan bir metot çağırımıdır. 
			Object result = methodInvocation.proceed();
			// Aynı AfterReturningAdvice - AfterReturning gibidir.
			System.out.println("### 2:"
					+ " Çağırılan metodun SONRAKİ dururmu.");
			return result;
 
		   } catch (IllegalArgumentException e) {
			 // Aynı ThrowsAdvice - AfterThrowing metodu gibidir.
			System.out.println("### 2:"
					+ " Çağırılan metotta İSTİSNA"
					+ " meydana gelme dururmu.");
			throw e;
		}
	}
}





















