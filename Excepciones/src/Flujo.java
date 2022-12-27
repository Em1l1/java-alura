public class Flujo {

  public static void main(String[] args) {
    System.out.println("Inicio main");
    try {
      metodo1();
    } catch (MiException | ArithmeticException e) {
      e.printStackTrace();
    }
    System.out.println("Fin main");
  }

  private static void metodo1() throws MiException {
    System.out.println("Inicio metodo1");
    try {
      metodo2();
    } catch (MiException me) {
     me.printStackTrace();
    }
//    metodo2();
    System.out.println("Fin metodo1");
  }

  private static void metodo2() throws MiException {

    System.out.println("Inicio metodo2");
//    for (int i = 1; i <= 5; i++) {
//      System.out.println(i);
//
//      try { // Intenta esto
//        if (i == 3) {
//          int num = 0;
//          int resultado = i / num;
//          System.out.println(resultado);
//        }
//        String test = null;
//        System.out.println(test.toString());
//      } catch (ArithmeticException | NullPointerException exception) { // Atrapa el error
//        System.out.println("Atrapa exception");
//        System.out.println(exception.getMessage());
//        exception.printStackTrace();
//      }
//    }
//    ArithmeticException ae = new ArithmeticException();
//    throw new ArithmeticException();
//    System.out.println("Fin metodo2");


//      throw new MiException("Mi excepcion fue lanzada!");

//    StackOverflowError
//    metodo2()
    Cuenta cuenta = new Cuenta();
    int a = 50 / 0;
    cuenta c = null;
    c.deposita();

    throw new MiException("Mi excepcion fue lanzada");
  }

}
