package local.remote;

import javax.ejb.Local;
import javax.ejb.Remote;

/* Uma anota��o ou outra */
@Local
@Remote
public class LocalEremoto {
	
	/* Os beans de sess�o podem ser acessados de duas maneiras: local e remoto
	 * 
	 *  Local: somente � acesso por requisi��es originarias do proprio container que o bean � executado
	 *  
	 *  Remote: pode se acessado de forma remota. por qualquer cliente, em qualquer container
	 *  
	 *  */
}
