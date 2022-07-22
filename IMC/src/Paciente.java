public class Paciente {
	double peso;
	double altura;
	double imc;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}
	
	//método construtor
	Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	double calcularIMC() {
		return imc = peso / (altura * altura);
	}

	void diagnostico() {
		if (calcularIMC() < 16) {
			System.out.println("Baixo peso muito grave");
		} else if (calcularIMC() > 16 && calcularIMC() < 16.99) {
			System.out.println("Baixo peso grave");
		} else if (calcularIMC() > 17 && calcularIMC() < 18.49) {
			System.out.println("Baixo peso");
		} else if (calcularIMC() > 18.50 && calcularIMC() < 24.99) {
			System.out.println("Peso normal");
		} else if (calcularIMC() > 25 && calcularIMC() < 29.99) {
			System.out.println("Sobrepeso");
		} else if (calcularIMC() > 30 && calcularIMC() < 34.99) {
			System.out.println("Obesidade grai I");
		} else if (calcularIMC() > 35 && calcularIMC() < 39.99) {
			System.out.println("Obesidade grai II");
		} else if (calcularIMC() > 39.99) {
			System.out.println("Obesidade grai III");
		}
	}
}
