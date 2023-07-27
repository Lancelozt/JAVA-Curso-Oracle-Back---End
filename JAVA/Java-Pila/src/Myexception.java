/*
 * LA GERARQUIA DE LAS EXCEPCIONES SE BASA EN:
 *  										Throwable
 * 		EXECPTION (LANZADOS POR PROGRAMADORES)		ERROR (LANZADOS POR LOS DE ORACLE)	
 * 		CHECKED
 * 				RUNTIMEEXECPTION
 * 	           		UNCHECKED
 * 	
 * 					
 */
public class Myexception extends Exception{
	public Myexception() {
		super();
	}
	public Myexception(String Message) {
		super(Message);
	}
}

