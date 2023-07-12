package src;
public class cuentaCorriente extends Cuenta {

    public cuentaCorriente(int agencia, int nCuenta) {
        super(agencia, nCuenta);
    }
    // Sobre escritura de la funcion abstracta de la clase madre
    @Override
    public void deposito(double valor) {
        this.saldo = (valor + this.saldo);

    }

}

