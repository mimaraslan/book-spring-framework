package com.mimaraslan;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Cizim {

	public static void main(String[] args) {
		
		
		Resource resource = new FileSystemResource("spring.xml");
			
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);         
	
		Ucgen ucgen = (Ucgen) xmlBeanFactory.getBean("ucgen");
		ucgen.ciz();

	}
}
