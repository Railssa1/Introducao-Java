package br.com.Aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestaAluno {

	@Test
	void deveriaRetornarMedia() {
		Aluno aluno = new Aluno();
		aluno.bim1 = 40;
		aluno.bim2 = 90;
		aluno.bim3 = 80;
		aluno.bim4 = 50;
		assertEquals(aluno.media(), 65);
	}

	@Test
	void deveriaRetornarSeAlunoPassouDeAnoForTrue() {
		Aluno aluno = new Aluno();
		aluno.bim1 = 40;
		aluno.bim2 = 90;
		aluno.bim3 = 80;
		aluno.bim4 = 50;
		assertEquals(aluno.media(), 65);
		assertEquals(aluno.passouDeAno(), true);
	}

	@Test
	void deveriaRetornarSeAlunoReprovou() {
		Aluno aluno = new Aluno();
		aluno.bim1 = 20;
		aluno.bim2 = 90;
		aluno.bim3 = 20;
		aluno.bim4 = 50;
		assertEquals(aluno.media(), 45);
		assertEquals(aluno.passouDeAno(), false);
	}
}
