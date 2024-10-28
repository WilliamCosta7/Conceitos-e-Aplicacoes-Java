package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantos alunos ?");
		int qtDeAlunos = scanner.nextInt();

		System.out.println("Quantas notas por Aluno?");
		int qtDeNotas = scanner.nextInt();

		double[][] notasDaTurma = new double[qtDeAlunos][qtDeNotas];
		double total = 0;

		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %dª do  aluno %d:  ", n + 1, (a + 1));
				notasDaTurma[a][n] = scanner.nextDouble();
				total += notasDaTurma[a][n];
			}
		}

		double media = total / (qtDeAlunos * qtDeNotas);
		System.out.println("A média da turma é: " + media);

		for (double notas[] : notasDaTurma) {
			System.out.println(Arrays.toString(notas));
		}

		scanner.close();
	}

}
