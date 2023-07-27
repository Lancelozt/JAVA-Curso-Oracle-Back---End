
public  interface Auntenticable{ // Toda interfaz es abstracta
	
	// LOGGIN 
	public void setClave(String clave);
	
	public  boolean iniciarSesion(String clave);
	
}

/*
 * UNA INRERFAZ ES PARECISA A UNA CLASE ABSTRACTA (LA INTERFAZ NO PUEDE TENER VARIABLES, LA CLASE ABASTRACTA SI)
 * UNA INTERFAZ NO PUEDE HACER CONSTRUCTORES: (public void ejemplo(){
 * 		ejemplo ejemplo = ejemplo; 
 * })
 * LA INTERFAZ NO ES HIJA DE LA CLASE "FUNCIONARIO", PERO LAS HIJAS DE LA INTERFAZ SI PUEDE HEREDAR A "FUNCIONARIO"
 * LA INTERFAZ NO ES UNA "HERENCIA" DIRECTA, SOLO PRESTA COSAS EN COMUN
 */