import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroDePontos {
	
	@Test
	void pontosCriarTopicoBonusDoDia() {
		Usuario raissa = new Usuario();
		raissa.nome = "Raissa";
		CalculadoraBonus bonusUsuario = new CalculadoraBonus();
		bonusUsuario.bonusDoDia = 3;
		RegistroPonto registro = new RegistroPonto(bonusUsuario);
		registro.criarUmTopico(raissa);
		assertEquals(raissa.pontos, 15);
		
	}
	
	@Test
	void pontosCriarTopicoBonusDoDiaComUsuarioVip() {
		Usuario raissa = new Usuario();
		raissa.nome = "Raissa";
		raissa.vip = true;
		CalculadoraBonus bonusUsuario = new CalculadoraBonus();
		bonusUsuario.bonusDoDia = 2;
		RegistroPonto registro = new RegistroPonto(bonusUsuario);
		registro.criarUmTopico(raissa);
		assertEquals(raissa.pontos, 50);
		
	}

	@Test
	void pontosCriarTopico() {
		Usuario raissa = new Usuario();
		raissa.nome = "Raissa";
		CalculadoraBonus bonusUsuario = new CalculadoraBonus();
		RegistroPonto registro = new RegistroPonto(bonusUsuario);
		registro.criarUmTopico(raissa);
		assertEquals(raissa.pontos, 5);
		
	}
	
	@Test
	void pontosCriarTopicoVip() {
		Usuario raissa = new Usuario();
		raissa.nome = "Raissa";
		raissa.vip = true;
		CalculadoraBonus bonusUsuario = new CalculadoraBonus();
		RegistroPonto registro = new RegistroPonto(bonusUsuario);
		registro.criarUmTopico(raissa);
		assertEquals(raissa.pontos, 25);
		
	}
	
	@Test
	void pontosFazerUmComentario() {
		Usuario raissa = new Usuario();
		raissa.nome = "Raissa";
		CalculadoraBonus bonusUsuario = new CalculadoraBonus();
		RegistroPonto registro = new RegistroPonto(bonusUsuario);
		registro.fazerUmComentario(raissa);
		assertEquals(raissa.pontos, 3);
		
	}
	
	@Test
	void pontosFazerUmComentarioVip() {
		Usuario raissa = new Usuario();
		raissa.nome = "Raissa";
		raissa.vip = true;
		CalculadoraBonus bonusUsuario = new CalculadoraBonus();
		RegistroPonto registro = new RegistroPonto(bonusUsuario);
		registro.fazerUmComentario(raissa);
		assertEquals(raissa.pontos, 15);
		
	}
	
	@Test
	void pontosDarUmLike() {
		Usuario raissa = new Usuario();
		raissa.nome = "Raissa";
		CalculadoraBonus bonusUsuario = new CalculadoraBonus();
		RegistroPonto registro = new RegistroPonto(bonusUsuario);
		registro.darUmLike(raissa);
		assertEquals(raissa.pontos, 1);
		
	}
	
	@Test
	void pontosDarUmLikeVip() {
		Usuario raissa = new Usuario();
		raissa.nome = "Raissa";
		raissa.vip = true;
		CalculadoraBonus bonusUsuario = new CalculadoraBonus();
		RegistroPonto registro = new RegistroPonto(bonusUsuario);
		registro.darUmLike(raissa);
		assertEquals(raissa.pontos, 5);
		
	}

}
