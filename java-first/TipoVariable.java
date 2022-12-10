public class TipoVariable {
  public static void main(String[] args) {

    double variable1 = 230.89;
    int variable1Entero = (int) variable1;  // Cast
    // este metodo imprime en consola
    System.out.println(variable1Entero);

    long prueba = 122222222222222222L;
    System.out.println(prueba);
    short numeroPequeno = 12555;
    byte numeroAunMasPequeno = 15;
    float numeroDecimalPequeno = 2.4F;
    System.out.println(numeroDecimalPequeno);

    int resultado = (int) variable1 + variable1Entero;
    double resultado2 = variable1 + variable1Entero;
    System.out.println(resultado);
    System.out.println(resultado2);

  }
}