import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	private Map<Produto, Integer> carrinho = new HashMap<>();
	private static int quantidadeNoCarrinho;
	private static double total = 0;

	public void adicionaProduto(Produto produto, int quantidade) {
		if (carrinho.containsKey(produto)) {
			carrinho.put(produto, quantidade += quantidade);
		} else {
			carrinho.put(produto, quantidade);
			quantidadeNoCarrinho += quantidade;
		}
	}

	public void removeProduto(Produto produto, int quantidade) {
		if (carrinho.containsKey(produto)) {
			carrinho.remove(produto);
			quantidadeNoCarrinho -= quantidade;
		}
	}

	public double getPrecoTotalCarrinho() {
		for (Produto produto : carrinho.keySet()) {
			total = produto.getPreco() * quantidadeNoCarrinho;
		}

		return total;
	}

	public Map<Produto, Integer> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Map<Produto, Integer> carrinho) {
		this.carrinho = carrinho;
	}

	public static int getQuantidadeNoCarrinho() {
		return quantidadeNoCarrinho;
	}

	public static void setQuantidadeNoCarrinho(int quantidadeNoCarrinho) {
		CarrinhoDeCompras.quantidadeNoCarrinho = quantidadeNoCarrinho;
	}

	public static double getTotal() {
		return total;
	}

	public static void setTotal(double total) {
		CarrinhoDeCompras.total = total;
	}

}
