package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	 final String nome;
	final List<Compra> compras = new ArrayList<>();

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	void adcionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	double obterValorTotal() {
		double valorTotal = 0;

		for (Compra compra : compras) {
			valorTotal += compra.obterValorCompra();
		}
		return valorTotal;
	}

	@Override
	public String toString() {
		return "Cliente " + nome + " Valor total: " + obterValorTotal();
	}

}
