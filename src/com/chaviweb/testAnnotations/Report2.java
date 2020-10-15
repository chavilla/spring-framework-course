package com.chaviweb.testAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Report2 implements CreationReport {

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Presentación del informe del segundo cuatrimestre";
	}

}
