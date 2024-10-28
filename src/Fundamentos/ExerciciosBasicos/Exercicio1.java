package Fundamentos.ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		final int const1 = 32;
		final double const2 = 5.0 / 9.0;
		double F = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor em Fahrenheit");
		F = entrada.nextDouble();
		double C = (F - const1) * const2;

		System.out.println("Temperatura em C = " + C + "ºC.");
		
		entrada.close();

	}

}
