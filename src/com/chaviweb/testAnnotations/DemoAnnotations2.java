package com.chaviweb.testAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Read xml configuration
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// ask a bean
		Employee jesus=context.getBean("commercialSenior", Employee.class);
		Employee ashley=context.getBean("commercialSenior", Employee.class);
		
		// refer to the same object
		if(jesus==ashley) {
			System.out.println("El mismo objeto");
			System.out.println(jesus + " " + ashley);
		}	
		else {
			System.out.println("No apuntan al mismo");
			System.out.println(jesus.hashCode());
			System.out.println(ashley.hashCode());
		}
		
		//close the context
		context.close();
	

	}

}
