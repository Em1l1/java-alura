public class Gerente extends Funcionario {

  private String clave;

  public void setClave(String clave) {
    this.clave = clave;
  }

  public boolean iniciarSesion(String clave) {
    return clave == "AluraCursosOnLine";
  }

  // sobre-escritura de metodo
  public double getBonificacion() {
    return super.getBonificacion() + super.getBonificacion();
  }
}
