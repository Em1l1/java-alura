public class PruebaConstructor {

  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta(3);
    cuenta.setAgencia(-4);

    System.out.println(cuenta.getAgencia());
  }
  
}
