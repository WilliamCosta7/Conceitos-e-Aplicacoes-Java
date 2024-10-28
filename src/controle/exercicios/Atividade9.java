package controle.exercicios;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {

		int valor = 0, maior = 0;
		int i = 0;
		Scanner scanner = new Scanner(System.in);

		while (i < 10) {
			System.out.println("Digite o valor comparativo");
			valor = scanner.nextInt();
			if (valor > maior) {
				maior = valor;
			}
			i++;
		}

		System.out.println("maior valor: " + maior);
		scanner.close();
	}

}
