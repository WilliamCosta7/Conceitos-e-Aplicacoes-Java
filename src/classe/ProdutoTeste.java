package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89);
		// p1.nome = "Notebook"; foi feito por um construtor
		// p1.preco = 4356.89;
		// p1.desconto = 0.25; é estatico

		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		double precoFinal1 = p1.precoComdesconto();
		double precoFinal2 = p2.precoComdesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("Média do carrinho = R$ %.2f", mediaCarrinho);

	}

}
