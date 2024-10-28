package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.14;

	public AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	double area() {
		return PI * Math.pow(raio, 2);
	}

	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}

	// Quando o atributo for de classe ele so deve ser acionado atraves da classe e
	// não da instancia
	// Quando o atributo for constante a convção o torna maiusculo na escrita
}
