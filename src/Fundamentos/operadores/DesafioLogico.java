package Fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		
		boolean trabalho1= false;
		boolean trabalho2= false;
		boolean tv50= trabalho1 && trabalho2;
		boolean tv32= trabalho1 ^ trabalho2;
		boolean sorvete= trabalho1 || trabalho2;
		
		System.out.println("Comprou a  TV 50\" ? " + tv50);
		System.out.println("Comprou a  TV 32\" ? " + tv32);
		System.out.println("Comprou sorvete ? " + sorvete);
		System.out.println("Comeu algo mais saudável? " + !sorvete); // Operador Unário
		
		
		
		
		
	}

}
