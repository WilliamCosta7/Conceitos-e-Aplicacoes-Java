package generics;

public class ParesTeste {
	
	public static void main(String[] args) {
		Pares<Integer,String> resultadoConcurso = new Pares<Integer, String>();
		
		resultadoConcurso.adicionar(1,"Isabella");
		resultadoConcurso.adicionar(2,"William");
		resultadoConcurso.adicionar(3,"Thamara");
		resultadoConcurso.adicionar(4,"Maria");
		resultadoConcurso.adicionar(2,"Iully");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2));
	}

}
