package com.chaviweb.Invoice;

import org.springframework.stereotype.Component;

@Component("user")
public class User implements UserInterface {

	@Override
	public String getUser() {
		// TODO Auto-generated method stub
		return "Producto generado por un usuario";
	}

}
