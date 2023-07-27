
public class testReferencias {
	public static void main(String[] args) {
		/* FUNCIONARIO NO PUEDE TENER ATRIBUTOS DE GERENTE, PERO GERENTE SI PUEDE */
		Funcionario trabajador = new Contador();
		// NOMBRES
		trabajador.setName("Diego");
		Gerente jefe = new Gerente();
		jefe.setName("Ximena");
		// SALARIOS
		trabajador.setSalario(2000);
		jefe.setSalario(10000);
	}
}
