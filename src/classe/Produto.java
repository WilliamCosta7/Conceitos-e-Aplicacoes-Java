package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	
	// O construto abaixo é padrão e vem implicito no java
	Produto() {

	}
	
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	double precoComdesconto() {
		double precoFinal = preco * (1 - desconto);
		return precoFinal;
	}

	double precoComdesconto(double descontoGerente) {
		double precoFinal = preco * (1 - desconto + descontoGerente);
		return precoFinal;
	}

	// a Identidade do metodo em java são:
	// os parametros e o nome sendo assim pelos parametros temos dois metodos

}
