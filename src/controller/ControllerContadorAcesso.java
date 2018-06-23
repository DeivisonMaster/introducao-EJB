package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Contador;

@ManagedBean
@SessionScoped
public class ControllerContadorAcesso {
	
	@EJB
	private Contador contador;
	
	public void incrementar(){
		contador.contadorAcesso();
	}
	
	public int getContador() {
		return contador.getContador();
	}
}
