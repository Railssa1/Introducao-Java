import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompra {

	@Test
	public void compraAVista() {
		Compra compraAVista = new Compra(600);
		assertEquals(1, compraAVista.getNumeroParcelas());
		assertEquals(600, compraAVista.getValorTotal());
		assertEquals(600, compraAVista.getValorParcela());
	}
	
	@Test
	public void compraParcelado() {
		Compra compraAVista = new Compra(4, 250);
		assertEquals(4, compraAVista.getNumeroParcelas());
		assertEquals(1000, compraAVista.getValorTotal());
		assertEquals(250, compraAVista.getValorParcela());
	}
	
	
}
