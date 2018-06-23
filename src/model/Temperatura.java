package model;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local
public class Temperatura {
	
	// Um componente session bean EJB Stateless utilizado apenas para receber uma informa��o e despachar sem guardar o estado de uma inst�ncia */

	public double converterParaFahrenheit(double celsius){
		return celsius * 1.8 + 32;
	}
}
