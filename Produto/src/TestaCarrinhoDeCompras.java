import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaCarrinhoDeCompras {

	@Test
	void testa() {
		Produto p = new Produto("Calça Jeans", 12, 15.3);
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p,2);

	}

}
