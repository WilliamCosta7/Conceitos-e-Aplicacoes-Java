package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila
		// DIferença é o comportamento quando a fila esta cheia
		// quando a fila esta cheia !
		fila.add("William"); // lança uma excessão
		fila.offer("Maria"); // retorna false
		fila.add("Thamara");
		fila.offer("Iully");
		fila.add("Isabella");
		fila.offer("Wellington");

		// quando a fila esta vaiza
		// Peek e Element -> obeter o proximo elementos da fila sem remover
		// DIferença é o comportamento quando a fila esta vazia

		System.out.println(fila.peek()); // retorna um null
		System.out.println(fila.peek()); // retorna uma excessão
		System.err.println(fila.element());
		System.err.println(fila.element());

		// Pool e Remove -> obtem o proximo elemento da fila e remove
		// DIferença é o comportamento quando a fila esta vazia
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // retorna uma excessão
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains("...")

	}

}
