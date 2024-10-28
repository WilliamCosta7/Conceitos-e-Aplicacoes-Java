package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> itens= new ArrayList<>();
	
	void adcionarItemNaCompra(int quantidade,Produto produto) {
		this.itens.add(new Item(quantidade,produto));
	}
	
	void adcionarItemNaCompra(String nome,double preco,int quantidade) {
		Produto produto = new Produto(nome,preco);
		this.itens.add(new Item(quantidade,produto));
	}
	
	
	
	double obterValorCompra() {
		double valorCompra = 0;
		
		for(Item item: itens) {
			valorCompra += item.produto.preco* item.quantidade;
		}
		
		return valorCompra;
	}
}
