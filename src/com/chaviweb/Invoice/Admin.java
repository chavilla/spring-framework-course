package com.chaviweb.Invoice;

import org.springframework.stereotype.Component;

@Component("admin")
public class Admin implements UserInterface {

	@Override
	public String getUser() {
		// TODO Auto-generated method stub
		return "Producto generado por el admin";
	}

}
