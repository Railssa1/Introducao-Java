import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaMetodos {

	@Test
	void deveriaRetornarBoasVindasComNome() {
		Metodos m = new Metodos();
		assertEquals("Boas vindas Raissa", m.boasVindasComNome("Raissa"));
	}
	
	@Test
	void deveriaRetornarBoasVindasComNomeESobrenome() {
		Metodos m = new Metodos();
		assertEquals("Boas vindas Raissa Moraes", m.boasVindasComNomeESobrenome("Raissa", "Moraes"));
	}
	
	@Test
	void deveriaRetornarIdade() {
		Metodos m = new Metodos();
		assertEquals(19, m.retornaIdade(19));
	}
	
	@Test
	void deveriaRetornarSePodeEntrar() { 
		Metodos m = new Metodos();
		assertEquals(true, m.verificaSePodeEntrar(19));
	}
	
	@Test
	void deveriaRetornarSeNaoPodeEntrar(){ 
		Metodos m = new Metodos();
		assertEquals(false, m.verificaSePodeEntrar(17));
	}
}

