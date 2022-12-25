public class Gerente extends Funcionario implements Autenticable {
  // Sobre-escritura de metodo
  public double getBonificacion() {
    System.out.println("Ejecutando desde Gerente");
//    return super.getSalario() + super.getSalario() *o 0.05;
    return 2000;
  }

  @Override
  public void setClave(String clave) {

  }

  @Override
  public boolean iniciarSesion(String clave) {
    return false;
  }
}
