package Fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final int const1 = 32;
		final double const2 = 5.0/9.0;
		double F = 86 ;
		double C = (F-const1)* const2;
		
		System.out.println("Temperatura em C = " + C + "ºC.");
		
	}
}
// C/const2+const1