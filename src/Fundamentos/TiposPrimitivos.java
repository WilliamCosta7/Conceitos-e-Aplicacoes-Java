package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipos numericos

		// inteiros
		byte anosDeEmpresa = 23; // byte -127 ate 128
		short numeroDeVoos = 542; // maior que byte e menor que int
		int id = 58789; // valor de número inteiro porem tem um limite
		long pontosAcumulados = 3_123_456_234L; // passou de inteiro precisa colocar a letra L, dica por "L" Maiusculo

		// reais

		float salario = 11_44445.44F;
		double vendasAcumuladas = 2_991_7797_103.01;

		// tipo booleano

		boolean estaDeFerias = false; // pode ser true

		// tipo caractere

		char status = 'A'; // ativo
		
		//dias de empresa do funcionario
		
		System.out.println("anos de empresa " + anosDeEmpresa);
		System.out.println("Numeros de voos " + numeroDeVoos/2);
		System.out.println("Pontos por real " + pontosAcumulados/vendasAcumuladas);
		System.out.println(id + " ganha " + salario + "$");
		System.out.println("Ferias ? " + estaDeFerias);
		System.out.println("Status " + status );
		
	}

}
