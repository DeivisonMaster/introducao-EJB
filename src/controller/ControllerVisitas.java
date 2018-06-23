package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Visita;

@ManagedBean
@SessionScoped
public class ControllerVisitas {
	
	@EJB
	private Visita visita;
	private String visitante;
	
	public void entrouVisita(){
		this.visita.entrouVisita(visitante);
	}
	
	public List<String> getVisitas(){
		return new ArrayList<>(visita.getListaVisitantes());
	}
	
	public String getVisitante() {
		return visitante;
	}
	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}
}
