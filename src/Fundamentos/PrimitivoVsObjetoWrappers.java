package Fundamentos;

public class PrimitivoVsObjetoWrappers {

	public static void main(String[] args) {

		String st = new String("texto");
		st.toUpperCase();

		// Wrappers são a versão objeto dos tipos primitivos!!!
		// Cada tipo primitivo possui uma classe ou seja 8 classes
		// Wrapper significa embrulho exemplos abaixo

		// byte
		Byte b = 100;
		Short s = 1000;

		// int
		Integer i = 10000;
		Long l = 10000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);

		// ponto flutuante ou reais

		Float f = 123.10F;
		System.out.println(f);

		Double d = 1234.5678;
		System.out.println(d);

		// booleano
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());

		// char
		Character c = '#';
		System.out.println(c + "...");
	}

}
