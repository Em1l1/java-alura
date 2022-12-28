public class Conexion implements AutoCloseable {
  public Conexion() {
    System.out.println("Abrinedo conexcion");
//     throw new IllegalStateException();
  }

  public void leerDatos() {
    System.out.println("Recibiendo Datos");
      throw new IllegalStateException();
  }

  public void cerrar() {
    System.out.println("Cerrando conexcion");
  }

  @Override
  public void close() throws Exception {
    cerrar();
  }
}
