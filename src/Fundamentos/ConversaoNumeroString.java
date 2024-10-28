package Fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		// forma possível mas não é uma boa prática

		System.out.println(("" + num1));
		System.out.println(("" + num2));
	}

}
