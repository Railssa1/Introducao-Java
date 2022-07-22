package modificadores.diferente;

import modificadores.Referencia;

public class Outra {
	public void testeAcesso() {
		Referencia r = new Referencia();
		r.modificadorPublico = 0;
		
		/*
		 * r.modificadorDefault = 0; 
		 * r.modificadorProtegido = 0; 
		 * r.modificadorPrivado = 0;
		 */
	}
}
