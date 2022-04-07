import java.util.Scanner;
public class Ex5Matriz {
//feito
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int mat[][] = new int[5][5];
		int i, j;
		int x = 0;
		char verificador;
		verificador = 'n';
		int linha = 0;
		int coluna = 0;		
		
		System.out.println("Leitura e impressão de uma matriz 5 x 5...");
		System.out.println("Carregando a matriz 5 x 5...");
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.println("Digite mat["+i+"]["+j+"]:");
				mat[i][j] = ent.nextInt();
			}
		}
		
		System.out.println("\nMatriz de 5x5 na tela:\n");
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.printf("%4d", mat[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.println("\nEntre com o número a ser procurado["+x+"]:");
		x = ent.nextInt();
	    for(i = 0; i < 5 ; i++){
	        for(j = 0; j < 5 ; j++){
	            if(mat[i][j] == x){
                   x = mat[i][j];	       
	               linha = i;
	               coluna = j;
	               verificador = 's';
	            }
	        }
	    }
	    
	    if(verificador == 's'){
	        System.out.printf("Número %d encontrado na linha %d e na coluna %d ", x , linha, coluna);
	       
	    }else{
	       System.out.println("Número não encontrado");
	    }
	}
}