package streams.desafioFilter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Loja {

	public static void main(String[] args) {
		
	 
		
		Produto p1 = new Produto ("Caneta", 1.99,0.3, 15, true);
		Produto p2 = new Produto ("Caderno", 14.00,0.55, 15, true);
		Produto p3 = new Produto ("Mochila", 150,0.00, 40, true);
		Produto p4 = new Produto ("Lápis de Cor", 9.99,0.3, 15, false);
		Produto p5 = new Produto ("Lancheira", 35,0.70, 10, true);
		Produto p6= new Produto ("Régua", 5,0.10, 8, false);
		Produto p7 = new Produto ("Borracha", 0.80,0.0, 15, true);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		System.out.println("Digite o número para escolher o  produto");
		System.out.println(Menu.opcao);
		
		Predicate<Produto> descontao = a -> a.desconto >= 0.3;
		Predicate<Produto> freteGratis = a -> a.freteGratis;
		Function<Produto, String> superPromocao = a->"Aproveite !!!!!" + a.nome +
				" por: " + a.preco + "R$";
		
		produtos.stream().filter(descontao)
		.filter(freteGratis)
		.map(superPromocao)
		.forEach(System.out::println);
		
		
		
		
		
		
		
	
		
	}

}
