
public class TestFuncionario {
	public static void main(String[] args) {
		Gerente trabajador = new Gerente();
		trabajador.setSalario(15000);
		System.out.println(trabajador.getBonificacion());
	}
}
