package Fundamentos.operadores;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		// Utilizando a potenciação

		int a = 3 * 4 - 10;
		int b = (int) Math.pow(a, 3); // Math.pow(v1,v2)
		double c = Math.pow(a, 3);

		
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		System.out.println();

		// DESAFIO
		double v1 = ((3 + 2) * 6);
		double v2 = Math.pow(v1, 2) / 6;
		double v3 = ((1 - 5) * (2 - 7)) / 2;
		double v4 = Math.pow(v3, 2);
		double v5 = Math.pow((v2 - v4), 3);
		double v6 = Math.pow(10, 3);
		double vfinal = v5 / v6;

		System.out.println(v2);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(vfinal);

	}

}
