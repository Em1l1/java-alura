public class TestReferencia3 {

  public static void main(String[] args) {
    Cuenta cuentaDeDiego = new Cuenta();
    Cliente cliente = new Cliente();
    cuentaDeDiego.titular = cliente;

    System.out.println(cuentaDeDiego.titular.nombre);
  }
  
}
