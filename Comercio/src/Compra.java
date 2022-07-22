public class Compra {
	int valorTotal;
	int numeroParcelas;

	//Construtor a vista
	public Compra(int valor) {
		valorTotal = valor;
		numeroParcelas = 1;
	}

	//Construtor parcelado
	public Compra(int quantidadeParcelas, int valorParcelas) {
		numeroParcelas = quantidadeParcelas;
		valorTotal = valorParcelas * quantidadeParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public int getValorParcela() {
		return valorTotal/numeroParcelas;
		
	}

}
