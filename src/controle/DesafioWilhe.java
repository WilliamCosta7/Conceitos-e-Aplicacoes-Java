package controle;

import java.util.Scanner;

public class DesafioWilhe {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		double soma = 0;
		int i = 0;
		double media;

		while (!(nota == -1)) {
			System.out.println("Digite a nota: ");
			nota = scanner.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				soma = soma + nota;
				i++;
			} else if (nota == -1) {
				System.out.println("FIM!");
			} else {
				System.out.println("Digite uma nota válida");
			}
		}
		media = soma / i;
		System.out.println("A méida das notas é" + media);

		scanner.close();

	}

}
