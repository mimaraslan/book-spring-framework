package com.mimaraslan;

import org.springframework.context.
							ConfigurableApplicationContext;
import org.springframework.context.support.
							ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {

	 ConfigurableApplicationContext context
	 =new ClassPathXmlApplicationContext("SpringBeansConfig.xml");						

	 Listeler list=context.getBean("listelerBean",Listeler.class);

	 System.out.println(list);

	 context.close();
	}
}



