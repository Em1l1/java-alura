public class TestReferencias {

//  Elemento mas generico puede ser adaptado al elemento mas especifio
  public static void main(String[] args) {
    Funcionario funcionario = new Gerente();
    funcionario.setNombre("Diego");

    Gerente gerente = new Gerente();
    gerente.setNombre("Jimena");

    funcionario.setSalario(2000);
    gerente.setSalario(10000);

    System.out.println();
    System.out.println();
  }
}
