
public class Ex7Matriz {
//feito
	public static void main(String[] args) {
		int A[][] = new int[10][10];
		int i, j;
		System.out.println("Leitura e impressão de uma matriz 10 x 10...");
		System.out.println("Carregando a matriz 10 x 10...");
	
		System.out.println("\nMatriz de 10x10 na tela:\n");
		for(i=0; i<10; i++) {
			for(j=0; j<10; j++) {
				if ( i < j) {
					A[i][j] =  2 * i  + 7 * j - 2;
				}
				else if ( i == j) {
					A[i][j] = 3 * i * i - 1;
				}
				else {
					A[i][j] = 4 * i * i * i - 5 * j * j + 1;
				}
			}
			
		}
		
		for ( i=0; i<10; i++) {
			for ( j=0; j<10; j++) {
				System.out.printf("[%4d]", A[i][j]);
			}
			System.out.printf("\n");
		}
		
	}
}