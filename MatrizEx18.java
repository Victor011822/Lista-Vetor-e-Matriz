import java.util.Scanner;

public class MatrizEx18 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int mat[][] = new int[3][3];
		int v[] = new int[3];
		int i, j;
		
		System.out.println("Leitura e impressão de uma matriz 3 x 3...");
		System.out.println("Carregando a matriz 3 x 3...");
		for(i=0; i<v.length; i++) { v[i] = 0; }
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.println("Digite mat["+i+"]["+j+"]:");
				mat[i][j] = ent.nextInt();
				v[j] += mat[i][j];
			}
		}
		
		System.out.println("\nMatriz 3x3 na tela:\n");
		for ( i=0; i<3; i++) {
			for ( j=0; j<3; j++) {
				System.out.printf("%4d", mat[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.println("\nVetor com a soma das colunas:");
		for ( i=0; i<v.length; i++) {
			System.out.printf("%4d", v[i]);
		}	
	}
}
