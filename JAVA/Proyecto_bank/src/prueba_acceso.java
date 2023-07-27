
public class prueba_acceso {
	public static void main(String[] args) {
		cuenta pene = new cuenta(45);
		cuenta vagina = new cuenta(46);
		pene.deposito(50000);
		pene.transfer(1000, vagina);
		System.out.println(pene.getSaldo());
		System.out.println(vagina.getSaldo());
	}
}
