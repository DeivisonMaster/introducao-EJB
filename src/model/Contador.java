package model;

import javax.ejb.Singleton;

@Singleton
public class Contador {
	
	private int contador;
	
	public void contadorAcesso(){
		contador++;
	}
	
	public int getContador() {
		return contador;
	}
}
