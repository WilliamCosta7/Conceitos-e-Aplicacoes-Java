package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "William Costa";
		u1.email = "willcosta7!ezmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "William Costa";
		u2.email = "willcosta7!ezmail.com";
		
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}

}
