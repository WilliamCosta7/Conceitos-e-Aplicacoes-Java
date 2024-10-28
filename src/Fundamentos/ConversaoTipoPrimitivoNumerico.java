package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {

		double a = 1; // conversão implicita
		System.out.println(a);

		float b = (float) 1.123456789988; // convesão explícita (CAST) pode haver perca de informação
		// o valor poderia ser convertido utilizando a letra f apos o valor da variavel
		System.out.println(b);

		int c = 4;
		byte d = (byte) c; // convesão explícita (CAST)
		// O java avalia o tipo e não o valor, int é maior que byte e pode haver uma
		// perca de informação
		System.out.println(d);

		double e = 1.999999;
		int f = (int) e; // convesão explícita (CAST)
		System.out.println(f);

	}

}
