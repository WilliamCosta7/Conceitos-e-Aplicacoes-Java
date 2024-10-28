package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("William"));
		usuarios.add(new Usuario("Iully"));
		usuarios.add(new Usuario("Isabella"));
		
		boolean resultado = usuarios.contains(new Usuario("Isabella"));
		System.out.println(resultado);
		
		
	}

}
