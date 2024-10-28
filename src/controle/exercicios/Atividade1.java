package controle.exercicios;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num;

		System.out.println("Digite um numero:");
		num = scanner.nextDouble();

		if ((num >= 0) && (num <= 10) && (num % 2 == 0)) {
			System.out.println(num + " é par e está entre 0 e 10");
		} else {
			System.out.println(num + " não se encaixa nos paramentros ser par ou estar entre 0 e 10");
		}

		scanner.close();
	}
}
