package Fundamentos.ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		final int const1 = 32;
		final double const2 = 5.0 / 9.0;
		double C = 0;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor em Celsius");
		C = entrada.nextDouble();
		double F = C / const2 + const1;

		System.out.println("Temperatura em F = " + F + "ºF.");
		entrada.close();

	}

}
