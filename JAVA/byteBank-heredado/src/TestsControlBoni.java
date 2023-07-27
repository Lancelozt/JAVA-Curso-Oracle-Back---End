
public class TestsControlBoni {
	public static void main(String[] args) {
		Funcionario empleado = new Gerente();
		empleado.setSalario(2000);
		Gerente jefe = new Gerente();
		jefe.setSalario(10000);
		// BONUS CONTROL
		ControlBonificacion cBonus = new ControlBonificacion();
		System.out.println(cBonus.registroSalario(jefe));
		System.out.println(cBonus.registroSalario(empleado));
	}
}
