package com.chaviweb.Invoice;

import org.springframework.stereotype.Component;

@Component
public class CategoryProduct implements CategoryInterface {

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "El producto pertenece a una categoria";
	}

}
