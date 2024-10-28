package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		double v1, v2;
		String operar;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		v1 = Double.parseDouble(entrada.next().replace(",", "."));
		System.out.println("Digite o segundo valor: ");
		v2 = Double.parseDouble(entrada.next().replace(",", "."));

		System.out.println(" Digite o tipo de operação : +, -, *, /, ou digite % para obter o resto da divisão");
		operar = entrada.next();

		double resultado = "+".equals(operar) ? v1 + v2 : 0;
		resultado = "-".equals(operar) ? v1 - v2 : resultado;
		resultado = "*".equals(operar) ? v1 * v2 : resultado;
		resultado = "/".equals(operar) ? v1 / v2 : resultado;
		resultado = "%".equals(operar) ? v1 % v2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", v1, operar, v2, resultado);
		entrada.close();
	}

}
