public class PruebaConstructor {

  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta(3);
    cuenta.setAgencia(-4);

    Cuenta cuenta2 = new Cuenta(333);
    Cuenta cuenta3 = new Cuenta(666);


    System.out.println(Cuenta.getTotal());


    System.out.println(cuenta.getAgencia());
  }
  
}
