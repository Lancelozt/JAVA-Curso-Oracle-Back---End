
public class SistemaInterno {
	private String clave = "12345";
	public boolean auntentica(Auntenticable gerente) {
		boolean Loggin = gerente.iniciarSesion(clave);
		if (Loggin) {
			System.out.println("Bienvenido");
			return true;
		}else {
			System.out.println("Clave o usuario incorrectos. ¿Olvido la contraseña?");
			return false;
		}
	}
}
