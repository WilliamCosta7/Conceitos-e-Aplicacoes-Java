package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double acontece uma conversão
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("Tamnaho é " + conjunto.size());

		conjunto.add("Teste");
		conjunto.add('x');

		System.out.println("Tamnaho é " + conjunto.size());
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamnaho é " + conjunto.size());
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		// conjunto.addAll(nums); // UNIÃO ENTRE OS CONJUNTOS
		conjunto.retainAll(nums);
		System.out.println(conjunto);

		conjunto.clear();
		System.out.println(conjunto);

	}
}
