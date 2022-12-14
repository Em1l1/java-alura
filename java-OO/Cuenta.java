class Cuenta {
    private double saldo;
    int agencia;
    int numero;
		Cliente titular = new Cliente();

		// No retorna valor
    public void depositar(double valor) {
      // saldo = saldo + valor;
			// Esta cuenta 	Esta cuenta		
			// This account 		This account
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
}
