package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("William Costa");
		Cliente cliente2 = new Cliente("Nininha");

		Produto produto1 = new Produto("Pêra", 3.50);
		Produto produto2 = new Produto("Maçã", 2.00);
		Produto produto3 = new Produto("Cuscuz", 3.00);
		Produto produto4 = new Produto("Feijão", 10.00);

		Compra compra1 = new Compra();
		Compra compra2 = new Compra();

		compra1.adcionarItemNaCompra(4, produto1);
		compra1.adcionarItemNaCompra(5, produto2);
		compra2.adcionarItemNaCompra(5, produto3);
		compra2.adcionarItemNaCompra(2, produto4);
		compra1.adcionarItemNaCompra("melancia", 12.00, 1);

		cliente1.adcionarCompra(compra1);
		cliente2.adcionarCompra(compra2);

		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());

	}
}
