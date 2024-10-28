package controle.exercicios;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {

		String palavra;

		System.out.println("Digite uma palavra:");
		int a = 1;
		int i = 0;
		Scanner scanner = new Scanner(System.in);

		palavra = scanner.next();

		while (a <= palavra.length()) {
			System.out.println(palavra.substring(i, a));
			i++;
			a++;
		}
		scanner.close();

	}

}
