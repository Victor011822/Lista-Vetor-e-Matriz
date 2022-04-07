import java.util.Scanner;

public class MatrizEx1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int mat[][] = new int[4][4];
		int i, j;
		System.out.println("Leitura e impressão de uma matriz 4 x 4...");
		System.out.println("Carregando a matriz 4 x 4...");

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Digite mat[" + i + "][" + j + "]:");
				mat[i][j] = ent.nextInt();
			}
		}

		System.out.println("\nMatriz de 4x4 na tela:\n");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.printf("%4d", mat[i][j]);
			}
			System.out.printf("\n");
		}

		System.out.printf("\nNumeros maiores que 10 na matriz:\n");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (mat[i][j] > 10) {
					System.out.printf("%4d", mat[i][j]);
				}
			}
		}
	}
}
