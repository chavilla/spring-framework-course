package com.chaviweb.testAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Report2 implements CreationReport {

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Presentaci�n del informe del segundo cuatrimestre";
	}

}
