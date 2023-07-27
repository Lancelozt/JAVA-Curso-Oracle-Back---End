
class cuenta{
	private double saldo;
	private int agencia;
	private int numero;
	cliente titular = new cliente();
	private static int nCuentas = 0; // Static is of the class no of the instance
	// Constructor (Obliga a dar información)
	public cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("No se aceptan numeros negativos");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		nCuentas++;
	}
	public int getAgencia() {
		return agencia;
	}
	// NO RETUNR
	public void deposito(double valor){
		
		this.saldo = valor + this.saldo; // use "this" when the object is create in the class
		
	}
	// RETURN
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = (this.saldo - valor);
			return true;
		}else {
			return false;
		}
	}
	public boolean transfer(double valor,
			                cuenta user) {
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
}
