import java.util.Random;

public class Ex13Matriz {
//feito
	public static void main(String[] args) {
		
		int mat[][] = new int [4][4];
		int mat2[][] = new int[4][4];
		int i, j;
		Random gerador = new Random();
		
		System.out.println("Gerando uma matriz 4 x 4 com [1,20]...");
		System.out.println("Carregando a matriz 4 x 4...");
		
		System.out.println("\nMatriz de 4 x 4 na tela:\n");
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
			    mat2[i][j] = gerador.nextInt(20);
				System.out.printf("%4d", mat2[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.println("\nMatriz triangular inferior de 4 x 4 na tela:\n");
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				if ( j>i) {
					System.out.printf("%4d", mat[i][j]);
					}
				
				else  {
					System.out.printf("%4d", mat2[i][j] );	
				}
			}
			System.out.printf("\n");
		}		
	}
}
