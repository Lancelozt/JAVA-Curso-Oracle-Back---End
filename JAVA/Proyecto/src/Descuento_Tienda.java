
public class Descuento_Tienda {
	public static void main(String[] arg) {
		double valorcompra = 150.0;
		double descuento;
		System.out.println("Precio inicial: " + valorcompra);
		if (valorcompra >= 100.0 && valorcompra <= 199.99) {
			descuento = 0.10; 
			descuento = (valorcompra * descuento);
			valorcompra =  valorcompra - descuento;
		} else if (valorcompra >= 200.0 && valorcompra <= 299.99) {
			descuento = 0.15;
			descuento = (valorcompra * descuento);
			valorcompra = valorcompra -  descuento;
		}
		System.out.println("Precio con descuento: " + valorcompra);
	}
}
