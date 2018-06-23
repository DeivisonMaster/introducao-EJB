package callback;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;

@Stateful
public class Callbacks {
	
	@PostConstruct
	public void instanciaCriada(){
		// m�todo invocado pelo container sempre que uma nova inst�ncia for criada sendo seu uso para inicializar processo ou acessar recursos
	}
	
	@PreDestroy
	public void instanciaDestruida(){
		// m�todo invocado pelo container antes que uma instancia seja destruida sendo seu uso para liberar recursos, etc
	}
	
	@PrePassivate
	public void instanciaPassivada(){
		// m�todo invocado pelo container momentos antes de sofrer o processo de passiva��o
	}
	
	@PostActivate
	public void instanciaAtivada(){
		// m�todo invocado pelo container antes do componente ser ativado
	}
	
}
