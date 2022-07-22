package br.com.Aluno;
public class Aluno {
	public String nome;
	public int bim1;
	public int bim2;
	public int bim3;
	public int bim4;
	
	public  int media() {
		int total = (bim1+ bim2 + bim3 + bim4) / 4;
		return total;
	}
	
	public  boolean passouDeAno() {
		if(media() >= 60) 
			return true;
		return false;
	}
}
