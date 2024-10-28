package controle.exercicios;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int cont = 0;
		double num;

		System.out.println("digite um número");
		num = scanner.nextDouble();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cont++;
			}
		}
		switch (cont) {
		case 1:
		case 2:
			System.out.println("Número primo");
			break;
		default:
			System.out.println("Número não primo");
		}

		scanner.close();
	}

}
