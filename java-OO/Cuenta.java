class Cuenta {
    double saldo;
    int agencia;
    int numero;
    String titular;

		// No retorna valor
    public void depositar(double valor) {
      // saldo = saldo + valor;
			// Esta cuenta 	Esta cuenta		
			// This account 		This account
			// This object
			this.saldo = this.saldo + valor;
    }

		// Retorna valor
		public boolean retirar(double valor) {
			if (this.saldo >= valor) {
				this.saldo = this.saldo - valor;
				return true;
			} else {
				return false;
			}
		}
}
