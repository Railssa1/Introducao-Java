package Teste;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Logica.CarroSoma;

class TestaCarroSoma {
	CarroSoma carro = new CarroSoma("Camaro", 20, 100);
	
	@Test
	void deveriaAcelerar() {
		carro.acelerar();
		assertEquals(20,  carro.getPotencia());
	}
	
	@Test
	void deveriaFrear() {
		carro.acelerar();
		carro.frear();
		assertEquals(10, carro.getVelocidade());
	}
	
	@Test
	void deveriaRetornarVelocidadeCarroParado() {
		assertEquals(0, carro.getVelocidade());
	}
	
	@Test
	public void deveriaAcelerarAteVelocidadeMaxima() {
		for(int i =0; i< 14; i++)
			carro.acelerar();
		assertEquals(100, carro.getVelocidade());
	}

}
