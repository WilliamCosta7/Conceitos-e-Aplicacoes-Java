package Fundamentos.ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		double v1;
		double r2, r3;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor");
		v1 = entrada.nextDouble();

		r2 = Math.pow(v1, 2);
		r3 = Math.pow(v1, 3);

		System.out.println("Resultado do quadrado e do cubo respectivamente são: " + r2 + ", " + r3);

		entrada.close();
	}

}
