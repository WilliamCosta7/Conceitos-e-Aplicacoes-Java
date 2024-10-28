package Fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		a++; // a = a + 1
		a--; // a = a - 1

		++b; // b= b + 1
		--b; // b = b- 1

		System.out.println(a);
		System.out.println(b);

		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // Existe uma precedencia quando o sinal vem antes da variavel, nesse caso
										// precede a igualdade ja se o sinal vier depois ele tem menor precedencia
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}

}
