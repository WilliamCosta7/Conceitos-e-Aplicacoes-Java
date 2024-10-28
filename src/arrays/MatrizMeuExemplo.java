package arrays;

import java.util.Arrays;
import java.util.Random;

public class MatrizMeuExemplo {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] vetor = new int[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				vetor[i][j] = random.nextInt(10);
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(vetor[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		for (int vetorAux[] : vetor) {
			System.out.println(Arrays.toString(vetorAux));
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < vetor[i].length;j++) {
				System.out.print(vetor[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
