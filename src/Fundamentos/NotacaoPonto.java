package Fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X";
		s.toUpperCase();
		System.out.println(s);// a variável s não foi atualizada

		System.out.println();

		s = s.toUpperCase();
		System.out.println(s); // variável atualizada
		
		System.out.println();

		s = s.replace("X", "amigo"); // replace altera a parte da variavel escolhida
		System.out.println(s.toUpperCase()); // variavel não foi atualizda para a formula maiuscula mas o metodo foi
												// chamado para a escrita
	
		
		//TIPO PRIMITIVO NÃO POSSUI NOTAÇÃO PONTO!
		
	}

}
