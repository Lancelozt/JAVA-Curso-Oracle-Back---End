
public class CuentaAhorros extends cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void deposito(double valor) {
		this.saldo = valor + this.saldo;
	}
	
}
