
public class TestCuenta {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 4);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		cc.deposito(50000);
		cc.transfer(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
		
	}
}
