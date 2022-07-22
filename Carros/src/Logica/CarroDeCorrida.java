package Logica;

public abstract class CarroDeCorrida {

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;
	
	public CarroDeCorrida(String nome,int velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}
	

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public abstract void acelerar();

	public void frear() {
		velocidade = velocidade / 2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void imprimir() {
		System.out.println("O carro " + nome + " está a velocidade " + getVelocidade() + " Km/h");
	}

}
