package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d = new Data();
		var d2 = new Data(31, 12, 2020);

		System.out.println("Data: " + d.dia + "/" + d.mes + "/" + d.ano);
		System.out.printf("Data: %d/%d/%d\n", d.dia, d.mes, d.ano);
		System.out.println(d.obterData());
		System.out.println(d2.obterData());
		d2.imprimirDataFormatada();

		d.imprimirDataFormatada();
	}

}
