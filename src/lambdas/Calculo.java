package lambdas;

@FunctionalInterface
public interface Calculo {

	// A interface funcional so permite um metodo no perfil da interface (publico e abstrato)
	double executar(double a, double b);

	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
