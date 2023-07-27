
public class referencia {
	public static void main(String[] args) {
		cuenta micuenta = new cuenta(100);
		cliente Giovani = new cliente();
		Giovani.setNombre("Giovani");
		Giovani.setDocumeno("Hola");
		Giovani.setTelefono("+52 5585634529");
		micuenta.titular = Giovani;
	}
}

//VERSION: 0.1