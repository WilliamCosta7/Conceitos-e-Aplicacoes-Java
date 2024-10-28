package streams.desafioMap1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
	
		Consumer<Integer> println = System.out::println;
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		nums.forEach(println);
		
		System.out.println();
		System.out.println();
		
		Function<Integer, String> numeroParaStringBinaria =  Integer::toBinaryString;
		Function<String, StringBuilder> paraStringBuilder = valor -> new StringBuilder(valor);
		Function<StringBuilder, StringBuilder> inverterString = valor -> valor.reverse();
		Function<StringBuilder, String> paraString = valor -> valor.toString();
		Function<String, Integer> paraInteiro = valor -> Integer.parseInt(valor,2);
		
		nums.stream()
		.map(numeroParaStringBinaria)
		.map(paraStringBuilder)
		.map(inverterString)
		.map(paraString)
		.map(paraInteiro)
		.forEach(println);
		
		System.out.println("\n\nCorreção do desafio");
		
		UnaryOperator<String> inverter =
				s-> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioParaInt = 
				s -> Integer.parseInt(s, 2);
				
				nums.stream()
				.map(Integer::toBinaryString)
				.map(inverter)
				.map(binarioParaInt)
				.forEach(System.out::println);
				
				// proximo desafio lembrar de tentar otimizar meu código 
		
		
		
	}

}
