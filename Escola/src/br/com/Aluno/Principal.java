package br.com.Aluno;

public class Principal {

	public static void main(String[] args) {
		Aluno raissa = new Aluno();

		raissa.bim1 = 70;
		raissa.bim1 = 60;
		raissa.bim1 = 80;
		raissa.bim1 = 70;

		System.out.println(raissa.media());
		System.out.println(raissa.passouDeAno());

	}

}
