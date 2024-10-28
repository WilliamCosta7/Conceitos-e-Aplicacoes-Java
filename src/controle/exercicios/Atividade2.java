package controle.exercicios;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int bissesto;
		System.out.println("Indique um ano");
		bissesto = scanner.nextInt();
		if (bissesto % 4 == 0) {
			System.out.println("é um ano bissesto");
		} else {
			System.out.println("não é um ano bissesto");
		}
		scanner.close();
	}
}
