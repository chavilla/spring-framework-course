package com.chaviweb.testAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Report1 implements CreationReport {

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return "Presentaci�n del informe del primer cuatrimestre";
	}

}
