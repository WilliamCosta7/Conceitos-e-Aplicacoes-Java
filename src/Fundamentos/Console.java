package Fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite sua idade");
		int idade = entrada.nextInt();
	//	entrada.nextLine(); // aqui é feita a leitura \n deixado pela tecla enter quando o int é digitado.

		System.out.print("Digite seu nome: ");
		String nome = entrada.next();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.next();

		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

		entrada.close();

		/*
		 * A maneira como o nextInt() faz a leitura dos valores.
		 * 
		 * Esse método faz a leitura de um único número, por exemplo, 58 ou 958. Mas
		 * quando digitamos os inputs, além do valor que deve ser lido, também apertamos
		 * enter, o que gera um caracter "\n" no buffer de entrada (fila de coisas que
		 * devem ser lidas), que é uma representação do enter.
		 * 
		 * Então, o que acontece é: "Qual a sua idade?" é impresso, digitamos o valor e
		 * apertamos enter. Quando fazemos isso, o buffer de entrada fica com o conteúdo
		 * "25\n", e quando o nextInt() faz a leitura, ele lê apenas o 25, deixando o
		 * "\n" para trás. Depois disso, "Qual o seu nome?" é impresso, e o método
		 * nextLine() vai ler tudo que estiver no buffer de entrada até encontrar um
		 * "\n". Como o nextInt() deixou um "\n" para trás, é esse o valor que o
		 * nextLine() lê. Isso conclui a leitura e a próxima linha de código, que é
		 * "Qual o seu sobrenome?", é impressa.
		 * 
		 * Para resolver esse problema, precisamos "pegar" o "\n" que o nextInt() não
		 * lê. Isso pode ser feito colocando um comando nextLine() depois do nextInt(),
		 * de modo que o código abaixo vai funcionar da maneira como queríamos.
		 */

	}

}
