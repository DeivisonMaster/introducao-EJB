package injection;

import javax.ejb.EJB;

public class A {
	private String nome;
	
	/* Injetando componente por EJB */
	@EJB
	private B b;
	
	public A(String nome){
		b.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
