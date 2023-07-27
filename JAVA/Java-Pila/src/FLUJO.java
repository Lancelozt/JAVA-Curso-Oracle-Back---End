
public class FLUJO {
	  public static void main(String[] args) {
		    System.out.println("Inicio de main");
		    try {
				metodo1();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("Fin de main");
		  }
		  public static void metodo1() throws Myexception{
		    System.out.println("Inicio de metodo1");
			metodo2();
		    System.out.println("Fin de metodo1");
		  }
		  public static void metodo2() throws Myexception{
		    System.out.println("Inicio de metodo2");
			throw new Myexception("Bomba explotada");

		  }	  
}
