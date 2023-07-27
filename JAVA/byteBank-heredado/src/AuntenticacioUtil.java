public class AuntenticacioUtil {
    private String clave;

    public boolean loggin(String clave){
        return this.clave == clave;
    }

    public void setClave(String clave){
        this.clave = clave;
    }
}
