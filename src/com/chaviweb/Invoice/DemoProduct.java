package com.chaviweb.Invoice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("productContext.xml");
		
		ProductInterface computer=context.getBean("Product",ProductInterface.class);
		ProductInterface computer2=context.getBean("Product",ProductInterface.class);
		
		System.out.println(computer.getPrice());
		
		System.out.println(computer.getUser());
		
		System.out.println(computer.getCategory());
		
		if(computer==computer2) {
			System.out.println("Son lo mismo");
		}
		else {
			System.out.println("No son lo mismo");
		}
		
		context.close();

	}

}
