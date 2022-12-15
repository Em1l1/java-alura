public class PruebaAcceso {

  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta();
    cuenta.setAgencia(- 22);
    cuenta.depositar(400);
    // cuenta.saldo = 200;
    cuenta.retirar(300);

    // cuenta.saldo = cuenta.saldo - 300;
    System.out.println(cuenta.getSaldo());
    System.out.println(cuenta.getAgencia());
  }
  
}
