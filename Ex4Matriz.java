import java.util.Scanner;
public class Ex4Matriz {
//feito
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int mat[][] = new int[4][4];
		int i, j;
		int maior = 0;
		int imaior = 0;
		int jmaior = 0;
		System.out.println("Leitura e impress�o de uma matriz 4 x 4...");
		System.out.println("Carregando a matriz 4 x 4...");
		
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				System.out.println("Digite mat["+i+"]["+j+"]:");
				mat[i][j] = ent.nextInt();
			}
		}
		
		System.out.println("\nMatriz de 4x4 na tela:\n");
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				System.out.printf("%4d", mat[i][j]);
			}
			System.out.printf("\n");
		}
		 
		 System.out.println("\nMaior valor:\n");
		 for(i = 0; i < 4; i++) {
	            for(j = 0; j < 4; j++) {
	                if(maior < mat[i][j]) {
	                    maior = mat[i][j];
	                    imaior = i;
	                    jmaior = j;
	                } 
	            }
	            System.out.printf("\n");
	           
	        }
		 System.out.printf("O maior elemento � %d, localizado em %d x %d.", maior, imaior, jmaior);
		 
	}
}