package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		int num = 0;
		System.out.println("digite o dia da semana");
		String dia = JOptionPane.showInputDialog("Digite o dia da semana!");
		dia = dia.toUpperCase();

		if (dia.contains("DOM")) {
			num = 1;
		} else if (dia.contains("SEG")) {
			num = 2;
		} else if (dia.contains("TER")) {
			num = 3;
		} else if (dia.contains("QUA")) {
			num = 4;
		} else if (dia.contains("QUI")) {
			num = 5;
		} else if (dia.contains("SEX")) {
			num = 6;
		} else if (dia.contains("SAB") || dia.contains("SÁB"))
			num = 7;

		System.out.println(num);
		
//		dia.equalsIgnoreCase(dia) 
//		Esse metodo poderia ser usado ao 
//		inves de transformar a variavel dia em letra maiuscula
	}

}
