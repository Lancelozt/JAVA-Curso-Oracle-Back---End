
public class ControlBonificacion {
	private double suma;
	
	public double registroSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		return this.suma;
	}
}
