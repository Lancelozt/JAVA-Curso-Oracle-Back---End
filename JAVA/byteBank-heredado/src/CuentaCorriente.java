
public class CuentaCorriente extends cuenta {
	
	public CuentaCorriente(int agencia, int numero) { /* AL SER HIJA DE "CUENTA" SE DEBE CUMPLIR CON LOS REQUERIMIENTOS DEL CONSTRUCTOR 
																					"CUENTA" CREADA EN CUENTA */ 
		super(agencia, numero);
	}
	@Override // <-- SOBREESCRIBE EL METODO MADRE
	public void retirar(double valor) {
		double comision = 0.2;
	}
	@Override
	public void deposito(double valor) {
		this.saldo = valor + this.saldo;
	}
}
