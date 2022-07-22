package Teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Logica.CarroMult;
import Logica.CarroSoma;

class TestaCarroMult {

	CarroMult carro = new CarroMult("Camaro", 1.4, 100);
	
	@Test
	void deveriaAcelerarUmaVez() {
		carro.acelerar();
		assertEquals(10,  carro.getVelocidade());
	}
	
	@Test
	void deveriaAcelerarDuasVez() {
		carro.acelerar();
		carro.acelerar();
		assertEquals(14,  carro.getVelocidade());
	}
	
	@Test
	void deveriaFrear() {
		carro.acelerar();
		carro.frear();
		assertEquals(5, carro.getVelocidade());
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
