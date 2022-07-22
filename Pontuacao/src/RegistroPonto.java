public class RegistroPonto {
	private CalculadoraBonus bonus;
	
	public RegistroPonto(CalculadoraBonus cb) {
		bonus = cb;
	}
	
	public void fazerUmComentario(Usuario usuario) {
		usuario.pontos += 3 * bonus.bonus(usuario);
	}

	public void criarUmTopico(Usuario usuario) {
		usuario.pontos += 5 * bonus.bonus(usuario);
	}

	public void darUmLike(Usuario usuario) {
		usuario.pontos += 1 * bonus.bonus(usuario);
	}
	
	
}
