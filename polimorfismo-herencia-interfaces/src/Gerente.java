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
    System.out.println("Ejecutando desde Gerente");
    return super.getSalario() + super.getBonificacion();
  }
}
