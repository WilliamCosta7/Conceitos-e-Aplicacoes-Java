package Fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(1));

		String s = "Boa tarde";

		System.out.println(s.concat("!!!")); // concatenação
		System.out.println(s.startsWith("Boa")); // Metodo booleano indica se a string começa pelo valor do paremetro
		System.err.println(s.endsWith("tarde")); // Metodo booleano indica se a string finaliza pelo valor do paremetro
		System.out.println(s.length()); // Metodo que indica o tamanho da string
		System.out.println(s.equalsIgnoreCase("BOA TARDE")); // compara e ignora o maiusculo ou minusculo

		System.out.println();
		System.out.println();

		var nome = "William";
		var sobrenome = "Costa";
		var idade = 26;
		var salario = 7596.9876;

		System.out.println(
				"Nome: " + nome + "\nSobrenome " + sobrenome + "\nIdade" + idade + "\nSalário" + salario + "\n\n");

		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

		System.out.println();
		System.out.println();

		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);

		System.out.println();
		System.out.println();

		System.out.println("TESTANDO STRING".contains("TESTANDO"));
		System.out.println("TESTANDO STRING".indexOf("STRING"));
		System.out.println("TESTANDO STRING".substring(9));
		System.out.println("TESTANDO STRING".substring(0, 9));
		System.out.println("TESTANDO STRING".length());
		System.out.println("TESTANDO STRING".replace(" ", "/"));

		System.out.println();

	}

}
