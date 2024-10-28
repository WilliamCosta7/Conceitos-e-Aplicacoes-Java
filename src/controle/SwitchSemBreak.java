package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "branca";

		switch (faixa.toLowerCase()) {
		
		case "preta":
			System.out.println("sei o Bassai - Dai");
		case "marrom":
			System.out.println("sei o Tekki Shodan");
		case "roxa":
			System.out.println("sei o Heian Yodan");
		case "verde":
			System.out.println("sei o Heian Youdan");
		case "laranja":
			System.out.println(" sei o Heian Nidan");
		case "amarela":
			System.out.println("sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		
		System.out.println("FIM!");

		int idade = 2;
		switch (idade) {
		case 3: 
			System.out.println("Vai para a escola");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
		
	}

}
