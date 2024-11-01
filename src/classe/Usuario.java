package classe;

public class Usuario {

	String nome;
	String email;

	@Override
	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) {

			Usuario outro = (Usuario) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			return nomeIgual && emailIgual;

		} else {
			return false;
		}
	}
	
	// O HashCode sera abordado em outra aula
	
	public int hashcode() {
		return 0;
	}

}
