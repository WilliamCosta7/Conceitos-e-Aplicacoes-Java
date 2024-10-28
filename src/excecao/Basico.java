package excecao;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;

		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception excecao) {
			System.out.println("Erro ao imprimir nome do aluno.");
		}

		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Erro " + e.getMessage());
		}

		System.out.println("Fim");
	}

	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}