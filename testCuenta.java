public class testCuenta {
    public static void main(String[] args) {
        cuentaCorriente usuario = new cuentaCorriente(0, 0);
        usuario.titular.setName("Giovani");
        usuario.deposito(15000);
        cuentaCorriente usuario2 = new cuentaCorriente(0, 1);
        usuario.titular.setName("Pene");
        usuario2.deposito(20000);
        usuario2.trasferencia(1000, usuario);
        System.out.println(usuario.saldo);
        System.out.println(usuario2.saldo);
    }
}
