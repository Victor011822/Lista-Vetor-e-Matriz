import java.util.Scanner;
public class Ex6Matriz {
//feito
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int mat[][] = new int[4][4];
		int mat2 [][] = new int[4][4];
		int mat3 [][] = new int[4][4];
		int i, j;
		System.out.println("Leitura e impressão de uma matriz 4 x 4...");
		System.out.println("Carregando a matriz 4 x 4...");
		
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				System.out.println("Digite mat["+i+"]["+j+"]:");
				mat[i][j] = ent.nextInt();
			}
		}
		
		System.out.println("\nPrimeira matriz de 4x4 na tela:\n");
		for( i=0; i<4; i++) {
			for( j=0; j<4; j++ ) {
				System.out.printf("\t%d",mat[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.println("\nSegunda matriz:\n");
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				System.out.println("Digite mat2["+i+"]["+j+"]:");
				mat2[i][j] = ent.nextInt();
			}
			System.out.printf("\n");
		}
		
		System.out.println("\nSegunda matriz de 4x4 na tela:\n");
		for( i=0; i<4; i++) {
			for( j=0; j<4; j++ ) {
				System.out.printf("\t%d",mat2[i][j]);
			}
			System.out.printf("\n");
		}
		
		
		System.out.println("\nTerceira matriz de 4x4 na tela:\n");
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				if( mat[i][j] >= mat2[i][j]) {
					mat3[i][j] = mat[i][j];
				}
				else {
					 mat3[i][j] = mat2[i][j];
				}
				
			}
			
		}
		
		for( i=0; i<4; i++) {
			for( j=0; j<4; j++ ) {
				System.out.printf("\t%d",mat3[i][j]);
			}
			System.out.printf("\n");
		}
			
	}

}