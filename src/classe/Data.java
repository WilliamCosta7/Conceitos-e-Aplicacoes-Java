package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
		/*
		 * dia = 01; mes = 01; ano = 1970;
		 */
		this(01, 01, 1970); // estou chamando o segundo construtor que esta abaixo, o this() dessa forma so
							// é possivel de UM CONSTRUTOR PARA OUTRO
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// essa função é melhor e mais útil
	String obterData() {
		String formato = "Data: %d/%d/%d"; // variável local como também os parametros , no java a variavel local não é inicializada por padrão
		return String.format(formato,  this.dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(this.obterData());
	}
}
