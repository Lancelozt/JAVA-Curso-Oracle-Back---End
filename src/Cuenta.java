package src;
public abstract class Cuenta {
    Client titular = new Client();
    protected double saldo; // protected ayuda a que, las clases hijas puedan ver variable
    private int agencia; 
    // Conocer la agencia - dar el #de la agencia    

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    private int nCuenta;

    // Conocer - dar el numero de cuenta
    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    // Contador de cuentas creadas
    private static int nCuentas; 
    public int getnCuentas(){
        return nCuentas;
    }

    public Cuenta(int agencia, int nCuenta){
        this.setnCuenta(nCuenta);
        if (agencia < 0){
            System.out.println("No existen numeros de agencias negativos");
        }else{
            this.agencia = agencia;
        }
        Cuenta.nCuentas ++;
    }

    /*FUNCIONES: 
     * DEPOSITO
     * TRASNFERENCIA
     * RETIRRO
     */
    public abstract void deposito(double valor); // Se genera como abstracto para que la función sea creada como lo requiera la clase

    public boolean trasferencia(double valor, Cuenta cuenta){
        if (this.saldo >= valor){
            retiro(valor);
            cuenta.deposito(valor);
            System.out.println("Trasferencia exitosa!");
            return true;
        }else{
            System.out.println("ERROR: SALDO INSUFICIENTE");
            return false;
        }
    }

    public boolean retiro(double valor){
        if (this.saldo >= valor){
            this.saldo = (this.saldo - valor);
            return true;
        }else{
            System.out.println("ERROR: SALDO INSUFICIENTE");
            return false;
        }
    }
}
