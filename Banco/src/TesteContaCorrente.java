import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TesteContaCorrente {
	ContaCorrente c = new ContaCorrente();

	@Test
	void deveriaDepositarValor() {
		c.depositar(200);
		assertEquals(c.saldo, 200);	
	}
	
	@Test
	void deveriaSacarValor() {
		c.depositar(200);
		double valorSacado = c.sacar(50);
		assertEquals(c.saldo, 150);	
		assertEquals(valorSacado, 50);
	}
	
	@Test
	void naoDeveriaSacarUmValorMaiorQueOSaldo() {
		c.depositar(200);
		double valorSacado = c.sacar(250);
		assertEquals(c.saldo, 200);	
		assertEquals(valorSacado, 0);
	}
}
