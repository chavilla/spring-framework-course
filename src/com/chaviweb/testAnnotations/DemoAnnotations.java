package com.chaviweb.testAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnnotations {

	public static void main(String[] args) {
		
		
		// Read xml configuration
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// ask a bean
		Employee jesus=context.getBean("commercialSenior", Employee.class);
		
		//use of the bean
		System.out.println(jesus.getTasks());
		System.out.println(jesus.getReport());
		
		//close context
		context.close();
		
	}

}
