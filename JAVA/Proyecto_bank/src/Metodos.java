
public class Metodos {
	public static void main(String[] args) {
		// ACCOUNT 1 
		cuenta miaccount = new cuenta(55);
		cliente Giovani = new cliente();
		Giovani.setNombre("Giovani");
		miaccount.titular = Giovani;
		miaccount.deposito(3100);
		// ACCOUNT 2 
		cuenta vaccount = new cuenta(20);
		cliente Viridiana = new cliente();
		Viridiana.setNombre("Viridiana");
		vaccount.titular = Viridiana;
		vaccount.deposito(500000);
		// Prueba de transferencia de Cuenta "viridiana" a cuenta "Giovani"
		if (vaccount.transfer(500, miaccount)) {
			System.out.println("Transferencia exitosa!");
			System.out.println("Transferido a: " + miaccount.titular.getNombre());
		}else {
			System.out.println("Eror, contacte con un asesor o revise el saldo de su cuenta");
		}
	}
}
