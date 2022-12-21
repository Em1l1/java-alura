public class Cuenta {

  private double saldo;
  private int agencia = 1;
  private int numero;
  private Cliente titular = new Cliente();

  private static int total = 0;

  public Cuenta(int agencia) {
    if (agencia <= 0) {
      System.out.println("No se permiten 0");
      this.agencia = 1;
    } else {
      this.agencia = agencia;
    }
    total++;
    System.out.println("Se van creado: " + total + " cuentas");
  }

  // No retorna valor
  public void depositar(double valor) {
    // saldo = saldo + valor;
    // Esta cuenta  Esta cuenta
    // This account                 This account
    // This object
    this.saldo += valor;
  }

  // Retorna valor
  public boolean retirar(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    }
    return false;
  }

  public boolean transferir(double valor, Cuenta cuenta) {
    if (this.saldo >= valor) {
      this.saldo = this.saldo - valor;
      cuenta.depositar(valor);
      return true;
    } else {
      return true;
    }
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setAgencia(int agencia) {
    if (agencia > 0) {
      this.agencia = agencia;
    } else {
      System.out.println("No estan permitidos valores negativos");
    }
  }

  public int getAgencia() {
    return agencia;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return titular;
  }

  public static int getTotal() {
    return Cuenta.total;
  }
}
