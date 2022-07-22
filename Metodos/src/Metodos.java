
public class Metodos {
	
	//Metodo sem parametro e sem retorno
	public void boasVindas() {
		System.out.println("Bem-vindo(a)");
	}
	
	//Com 1 parametro do tipo String
	public String boasVindasComNome(String nome) {
		return "Boas vindas " + nome;
	}
	
	//Com 2 parametros do tipo String
	public String boasVindasComNomeESobrenome(String nome, String sobrenome) {
		return "Boas vindas " + nome + " " + sobrenome;
	}
	
	public int retornaIdade(int idade) {
		return idade; 
	}
	
	public boolean verificaSePodeEntrar(int idade) {
		if(idade > 18) {
			return true;
		}
		return false;
	}
	
}
