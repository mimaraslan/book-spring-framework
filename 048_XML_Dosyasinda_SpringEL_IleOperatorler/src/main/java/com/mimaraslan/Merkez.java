package com.mimaraslan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Merkez {
	public static void main(String[] args) {		
 
	 ApplicationContext appCtx; 
	 appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

	 Operatorler operators = appCtx.getBean("operatorlerBean", Operatorler.class);
		  
		    System.out.println( "equalTest : " + operators.isEqualTest() +"\n"
			+ "notEqualTest : " + operators.isNotEqualTest() +"\n"
			+ "lessThanTest : " + operators.isLessThanTest() +"\n"
			+ "lessThanOrEqualTest : " + operators.isLessThanOrEqualTest() +"\n" 
			+ "greaterThanTest : " + operators.isGreaterThanTest() +"\n"
			+ "greaterThanOrEqualTest : "+operators.isGreaterThanOrEqualTest()+"\n"
			+ "andTest : " + operators.isAndTest() +"\n" 
			+ "orTest : " + operators.isOrTest() +"\n" 
			+ "notTest : " + operators.isNotTest() +"\n" 
			+ "addTest : " + operators.getAddTest() +"\n"
			+ "addStringTest : " + operators.getAddStringTest() +"\n"
			+ "subtractionTest : " + operators.getSubtractionTest() +"\n" 
			+ "multiplicationTest "	+ operators.getMultiplicationTest() +"\n"
			+ "divisionTest : " + operators.getDivisionTest() +"\n"
			+ "modulusTest : " + operators.getModulusTest() +"\n"
			+ "exponentialPowerTest : " + operators.getExponentialPowerTest()
	       );

		((ConfigurableApplicationContext)appCtx).close(); 				
	}
}

             											
	      		




