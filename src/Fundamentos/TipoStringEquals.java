package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {

		System.out.println("2" == "2");

		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		System.out.println();

		Scanner entrada = new Scanner(System.in);

		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // metodo .trim limpa os espaços em branco, usado no .nextLine(), o
												// .next() ja limpa automaticamente
		System.out.println("2".equals(s2.trim()));

		entrada.close();

	}

}