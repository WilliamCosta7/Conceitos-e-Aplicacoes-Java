package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
	
		Aluno a1 = new Aluno ("Iully", 7.1);
		Aluno a2 = new Aluno ("William", 6.1);
		Aluno a3 = new Aluno ("Thamara", 8.1);
		Aluno a4 = new Aluno ("Isabella", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Function<Aluno, Double> apenasNota= a -> a.nota;
		BiFunction<Media, Double, Media> calcularMedia = 
				(media,nota) -> media.adicionar(nota); 
				
		BinaryOperator<Media> combinarMedia = (m1,m2) -> Media.combinar(m1, m2);
		
		Media mediaAprovados = alunos.parallelStream()
		.filter(aprovado)
		.map(apenasNota)
		.reduce(new Media(), calcularMedia,combinarMedia);
		
		System.out.println("A média dos aprovados é: " + mediaAprovados.getValor());
	}

}
