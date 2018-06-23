package model;

import java.util.HashSet;
import java.util.Set;

import javax.ejb.Stateful;

@Stateful
public class Visita {
	
	private Set<String> listaVisitantes = new HashSet();
	
	public Set<String> getListaVisitantes() {
		return listaVisitantes;
	}
	
	public void entrouVisita(String visita){
		this.listaVisitantes.add(visita);
	}
}
