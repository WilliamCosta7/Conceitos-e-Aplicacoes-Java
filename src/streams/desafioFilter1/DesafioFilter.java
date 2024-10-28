package streams.desafioFilter1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class DesafioFilter {

	public static void main(String[] args) {
		// O DESAFIO PROPOSTO DEVE SER CRIADO POR MIM
		
		
	
		Lutador l1 = new Lutador ("Ali",20,0,14);
		Lutador l2 = new Lutador ("Tyson",19,2,17);
		Lutador l3 = new Lutador ("Butter",6,9,2);
		Lutador l4 = new Lutador ("Silva",1,3,1);
		Lutador l5 = new Lutador ("Winderson",1,4,1);
		Lutador l6 = new Lutador ("Fury",18,1,3);
		
		List<Lutador> lutadores = Arrays.asList(l1,l2,l3,l4,l5,l6);
		
		Predicate<Lutador> cartelPositivo = l -> l.vitorias - l.derrotas > 0;
		Predicate<Lutador> nocauteador = l -> l.nocautes > (l.vitorias/2);
		Function<Lutador, String> informacao = 
				l -> l.nome  + " É um excelente lutador, com o cartel de " + l.vitorias + " vitorias, sendo que foram "
									 + l.nocautes + " por nocaute, e " + l.derrotas + " derrotas";
				
				lutadores.stream()
				.filter(cartelPositivo)
				.filter(nocauteador)
				.map(informacao)
				.forEach(System.out::println);

	}

}
