
public class Gerente extends Funcionario {
	private String clave;

	public String getClave() {
		return clave;
	}
	// LOGGIN 
	public void setClave(String clave) {
		this.clave = clave;
	}
	public boolean iniciarSesion(String clave) {
		return clave == "Pene69";
	}
	// BONUS       (SOBRE ESCRITURA)
	@Override
	public double getBonificacion() {
		return (super.getSalario() + this.getSalario() * 0.5);
	}
}
