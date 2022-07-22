public class Principal {

	public static void main(String[] args) {
		Paciente raissa = new Paciente(64, 1.55);
		raissa.calcularIMC();
		raissa.diagnostico();
	}
}
