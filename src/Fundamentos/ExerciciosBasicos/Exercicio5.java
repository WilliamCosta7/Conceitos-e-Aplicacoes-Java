package Fundamentos.ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		double base;
		double altura;
		double area;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a base do triangulo");
		base = entrada.nextDouble();
		System.out.println("Digite a altura do triangulo");
		altura = entrada.nextDouble();

		area = (base * altura) / 2;

		System.out.println("Area do triangulo: " + area);

		entrada.close();

	}

}
