
public class Administrador extends Funcionario implements Auntenticable  {

	private AuntenticacioUtil util;

	public Administrador(){
		this.util = new AuntenticacioUtil();
	}
	
	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.loggin(clave);
	}

	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

}
