package Logica;

public class CarroSoma extends CarroDeCorrida{
	private int potencia;
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}
	
	public void acelerar() {
		velocidade += potencia;
		if (velocidade > velocidadeMaxima) {
			velocidade = velocidadeMaxima;
		}
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
