package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {

		Random random = new Random();

		int numAleatorio = random.nextInt(100) + 1;
		int numDigitado = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 10; i > 0; i--) {
			System.out.println("Você possui " + i + " chances para acertar, agora digite um novo valor:");
			numDigitado = scanner.nextInt();

			if (numDigitado == numAleatorio) {
				i = -1;
			} else if (numDigitado > numAleatorio) {
				System.out.println("O número digitado é maior");
			} else if (numDigitado < numAleatorio) {
				System.out.println("O número digitado é menor");
			}
		}

		if (numDigitado == numAleatorio) {
			System.out.println("PARABÉNS !!! VOCÊ ACERTOU");
			System.out.println("O número sorteado foi: " + numAleatorio);
		} else {
			System.out.println("Infelizmente não foi dessa vez!");
			System.out.println("O número sorteado foi: " + numAleatorio);
		}

		scanner.close();

	}

}
