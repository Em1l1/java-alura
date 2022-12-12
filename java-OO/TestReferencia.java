public class TestReferencia {

  public static void main(String[] args) {
    Cuenta primeraCuenta = new Cuenta();
    primeraCuenta.saldo = 200;


    Cuenta segundaCuenta = primeraCuenta;
    segundaCuenta.saldo = 100;

    System.out.println("Saldo primera Cuenta: " + primeraCuenta.saldo);

    segundaCuenta.saldo += 400;
    System.out.println("Saldo segunda Cuenta: " + segundaCuenta.saldo);

    System.out.println("Saldo segunda Cuenta: " + primeraCuenta);
    System.out.println("Saldo segunda Cuenta: " + segundaCuenta);


    if (primeraCuenta == segundaCuenta) {
        System.out.println("Son los mismo objeto");
    }

  }
  
}
