
public class cliente implements Auntenticable{
	private	String nombre;
	private	String telefono;
	private	String documeno;


	private AuntenticacioUtil util;

	public cliente(){
		this.util = new AuntenticacioUtil();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDocumeno() {
		return documeno;
	}

	public void setDocumeno(String documeno) {
		this.documeno = documeno;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		this.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.loggin(clave);
	}
	
}
