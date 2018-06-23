package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import model.Temperatura;

@ManagedBean
public class ControllerGraus {
	
	private double resultadoF;
	private double celsius;
	
	@EJB
	private Temperatura grausBean;

	
	public void converterParaFahrenheit(){
		this.resultadoF = grausBean.converterParaFahrenheit(celsius);
	}
	
	public double getCelsius() {
		return celsius;
	}
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	public double getResultadoF() {
		return resultadoF;
	}
}
