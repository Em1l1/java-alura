public class Funcionario {

  private String nombre;
  private String documento;
  private double salario;
  private int tipo;


  public Funcionario() {
    
  }
  
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }
  
  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getBonificacion() {
    // Si tipo = 1 es gerente
    // Si tipo es 0 es funcionario
    return this.salario * 0.05;
  }

  public int getTipo() {
    return tipo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }
}
