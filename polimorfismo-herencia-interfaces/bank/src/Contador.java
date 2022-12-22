public class Contador extends Funcionario {

  @Override
  public double getBonificacion() {
//    return super.getBonificacion();
    System.out.println("Ejecutando desde Contador");
    return 200;
  }
}
