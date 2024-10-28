package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("quantas notas voce deseja por ?");
		int tamanho = scanner.nextInt();
		double[] notas = new double[tamanho];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota");
			notas[i] = scanner.nextDouble();
		}
		
		double soma = 0;
		
		for(double nota : notas) {
			soma+=nota;
		}
		
		System.out.println(soma/notas.length);

		scanner.close();
	}

}
