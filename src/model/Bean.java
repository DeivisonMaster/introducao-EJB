package model;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local
public class Bean {
	
	public double converterParaFahrenheit(double celsius){
		return celsius * 1.8 + 32;
	}
}
