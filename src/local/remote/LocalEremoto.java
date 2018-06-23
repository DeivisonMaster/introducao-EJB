package local.remote;

import javax.ejb.Local;
import javax.ejb.Remote;

/* Uma anotação ou outra */
@Local
@Remote
public class LocalEremoto {
	
	/* Os beans de sessão podem ser acessados de duas maneiras: local e remoto
	 * 
	 *  Local: somente é acesso por requisições originarias do proprio container que o bean é executado
	 *  
	 *  Remote: pode se acessado de forma remota. por qualquer cliente, em qualquer container
	 *  
	 *  */
}
