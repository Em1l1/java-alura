public class TestCuentaExceptionChecked {

  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta();

    try {
      cuenta.deposita();
    } catch (MiException e) {
      e.printStackTrace();
    }
//    try {
//      cuenta.deposita();
//    } catch (MiException ex) {
//      System.out.println("Excepcion atrapada.");
//    }
  }
}
