public class ContaCorrente {
	double saldo;
	
	public double sacar(double valor) {
		if(valor > saldo) {
			return 0;
		}else {
			saldo -= valor;
			return valor;
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
}
