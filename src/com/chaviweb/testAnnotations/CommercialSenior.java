package com.chaviweb.testAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("commercialSenior")
@Scope("singleton")
public class CommercialSenior implements Employee {
	
	// Autowired en un campo de clase
	@Autowired
	@Qualifier("report2")
	private CreationReport creationReport;
	

	public CommercialSenior() {
		
	}
	
	
	// after bean creation
	@PostConstruct
	public void afterInit() {
		System.out.println("Ejecutado tras la creación del bean");
	}
	
	// After bean power off
	@PreDestroy
	public void beforeDestroy() {
		System.out.println("Ejecutado antes de la destruccion");
	}
	
	// Creado en el constructor
	/*@Autowired
	public CommercialSenior(CreationReport creationReport) {
		this.creationReport = creationReport;
	}*/

	@Override
	public String getTasks() {
		// TODO Auto-generated method stub
		return "Vender y Vender más";
	}

	//Creado en el metodo setter
	/*@Autowired
	public void setCreationReport(CreationReport creationReport) {
		this.creationReport = creationReport;
	}*/

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		//return "Informe generado por el comercial";
		return  creationReport.getReport();
	}

}
