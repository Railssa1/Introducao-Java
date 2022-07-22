public class ContaEspecial extends ContaCorrente {
	double limite;
	
	ContaEspecial(double limite){
		this.limite = limite;
	}
	
	public double sacar(double valor) {
		if(valor > (saldo + limite)) {
			return 0;
		}else {
			saldo -= valor;
			return valor;
		}
	}
}
