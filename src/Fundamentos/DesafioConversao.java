package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		String sal1, sal2, sal3;
		double salario1, salario2, salario3, media;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro salário");
		sal1 = entrada.nextLine().replaceAll(",", "."); //Esse metodo procura e substitui caracteres
		System.out.println("Digite o segundo salário");
		sal2 = entrada.nextLine().replaceAll(",", ".");
		System.out.println("Digite o terceiro salário");
		sal3 = entrada.nextLine().replaceAll(",", ".");
		salario1 = Double.parseDouble(sal1);
		salario2 = Double.parseDouble(sal2);
		salario3 = Double.parseDouble(sal3);
		media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A méida dos salarios é: " + media);

		entrada.close();

	}

}
