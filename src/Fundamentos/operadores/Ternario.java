package Fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

		// O modelo usa dois peradores o "?" e ":" dessar forma 3 operandos são
		// analisados

		double media = 9.0;
		String resultadoParcial = media >= 5.0 ? " em recuperação." : "reprovado."; // a expressão "media >= 5.0" é um
																					// operando e os valores "em
																					// recuperação" ou "reprovadp" são
																					// os outros operandos.
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial; // a expressão "media >= 7.0" é um
																				// operando e os valores "aprovado" ou
																				// resultadoParcial são os outros
																				// operandos.

		System.out.println("O aluno esta " + resultadoFinal);

		System.out.println();

		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		System.out.printf("\nTem desconto ? %s ", resultado);

	}

}
