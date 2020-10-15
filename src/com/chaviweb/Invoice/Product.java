package com.chaviweb.Invoice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.security.auth.Destroyable;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Product")
@Scope("prototype")
public class Product implements ProductInterface {
	
	private String id;
	private String name;
	private int price;
	private CategoryInterface category;
	@Autowired 
	@Qualifier("admin")
	private UserInterface myUser;
	
	@Autowired
	public Product(CategoryInterface category) {
		this.category=category;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "Este es el id";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Este es el name";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	public String getUser() {
		// TODO Auto-generated method stub
		return myUser.getUser();
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return category.getCategory();
	}

	@PostConstruct
	public void afterPropertiesSet(){
		// TODO Auto-generated method stub
		System.out.println("Después de haber creado el bean");
	}
	
	@PreDestroy
	public void beforeDestroy() {
		System.out.println("Antes de destruir el bean");
	}

}
