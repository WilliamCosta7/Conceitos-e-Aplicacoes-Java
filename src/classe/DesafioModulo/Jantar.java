package classe.DesafioModulo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("William", 95.8);
		double pesoInicial = p1.peso;
		System.out.println("Nome: " + p1.nome + ". Peso: " + p1.peso);
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijão", 0.300);

		p1.comer(c1);
		System.out.println("Nome: " + p1.nome + ". Peso: " + p1.peso);
		p1.comer(c2);
		System.out.println("Nome: " + p1.nome + ". Peso: " + p1.peso);
		double pesoFinal = p1.peso;

		System.out.println("Peso ganho: " + (pesoFinal - pesoInicial));

	}

}
