
public abstract class cuenta{
	
	protected double saldo; // CON PROTECTED, SUS CLASES HIJAS PUEDEN ACCEDER A ELLA
	private int agencia;
	private int numero;
	cliente titular = new cliente();
	
	private static int nCuentas;
	// Constructor (Obliga a dar información)
	public cuenta(int agencia, int numero) {
		this.setNumero(numero);
		if (agencia <= 0) {
			System.out.println("No se aceptan numeros negativos");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		cuenta.nCuentas ++;
	}
	public int getAgencia() {
		return agencia;
	}
	// NO RETUNR
	public abstract void deposito(double valor); // TENER UN METODO ABSTRACTO SE PUEDE SOLO EN CLASES ABSTRACTAS
		
	
	// RETURN
	public void retirar(double valor) throws saldoInsuficienteException {
		if (this.saldo < valor) {
		throw new saldoInsuficienteException("ERROR: SALDO INSUFICIENTE");	
		}
	}
	public boolean transfer(double valor,
			                cuenta user) throws saldoInsuficienteException {
		if (this.saldo >= valor) {
			retirar(valor);
			user.deposito(valor);
			return true;
		}else {
			return false;
		}
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public static int getnCuentas() {
		return nCuentas;
	}	
}
