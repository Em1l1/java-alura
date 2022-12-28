public class TestConexion {

  public static void main(String[] args) throws Exception {
    try(Conexion con = new Conexion()) {
      con.leerDatos();
    } catch (IllegalStateException ex) {
      System.out.println("Ejecuntado catch");
      ex.printStackTrace();
    }
/*
    Conexion con = null;
    try {
      con = new Conexion();
      con.leerDatos();
//      con.cerrar();
    } catch (IllegalStateException ex) {
      //TODO: handle exception
      System.out.println("Recibiendo exception");
      ex.printStackTrace();
    } finally {
      System.out.println();
      if (con != null) {
        // con = new Conexion();
        con.cerrar();
      }
    }

 */
  }
}

