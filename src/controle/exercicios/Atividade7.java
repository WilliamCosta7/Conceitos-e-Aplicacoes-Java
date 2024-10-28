package controle.exercicios;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = 0;
		int soma = 0;

		while (!(num < 0)) {
			soma = soma + num;
			System.out.println(
					"Digite mais um numero para a soma ao digitar um valor negativo o programa será finalizado");
			num = scanner.nextInt();
		}

		System.out.println("Resultado da soma foi: " + soma);

		scanner.close();
	}

}
