package controle.exercicios;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		double nota1, nota2, media;

		Scanner scanner = new Scanner(System.in);

		System.out.println("primeira nota: ");
		nota1 = scanner.nextDouble();
		System.out.println("segunda nota: ");
		nota2 = scanner.nextDouble();

		media = (nota1 + nota2) / 2;

		if ((media >= 7) && (media <= 10)) {
			System.out.println("Aprovado");
		} else if ((media >= 4) && (media <= 7)) {
			System.out.println("Recuperação");
		} else if ((media >= 0) && (media <= 4)) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Media invalida, confirme os valores das notas");
		}

		scanner.close();

	}

}
