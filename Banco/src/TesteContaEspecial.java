import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteContaEspecial extends TesteContaCorrente{
	ContaEspecial c = new ContaEspecial(100);
	
	@Test
	void naoDeveriaSacarUmValorMaiorQueOSaldo() {
		c.depositar(200);
		double valorSacado = c.sacar(350);
		assertEquals(c.saldo, 200);	
		assertEquals(valorSacado, 0);
	}
	
	
}
