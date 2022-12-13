public class TestReferencia2 {

  public static void main(String[] args) {
    Cliente diego = new Cliente();
    diego.nombre = "Diego";
    diego.documento = "34123423";
    diego.telefono = "9839082";

    Cuenta cuentaDeDiego = new Cuenta();
    cuentaDeDiego.agencia = 1;
    cuentaDeDiego.titular = diego;

    System.out.println(cuentaDeDiego.titular.documento);
    System.out.println(cuentaDeDiego.titular);
    System.out.println(diego);
  }
  
}
