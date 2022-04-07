import java.util.Scanner;
import java.util.Arrays;

public class ExVetor14 {

	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    int i, checked=0;
	    int A[] = new int [5];
	    int B[] = new int [5];
        int togetherAeB = A.length + B.length;
        int Conc[] = new int[togetherAeB];
		System.out.println("[+] Leitura de dois vetores de 10 inteiros...");
		System.out.println("[+] Leitura do vetor A: ");
	    for(i=0; i < A.length; i++) {
	      System.out.println("Digite os valores do vetor A["+i+"]");
	      A[i] = input.nextInt();
	      Conc[checked] = A[i];
	      checked++;
	    }
	    
	    System.out.println("\n[+] Leitura do vetor B: ");
	    for(i=0; i < B.length; i++) {
			System.out.println("Digite os valores do vetor B["+i+"]");
			B[i] = input.nextInt();
			Conc[checked] = B[i];
			checked++;
	    }
	    System.out.println("\nOs valores integrados são:");
	    System.out.println(Arrays.toString(Conc));
        
        int[ ] unicos = new int[ Conc.length ];
        int qtd = 0;
        for(i = 0 ; i < Conc.length ; i++ ) {
            boolean existe = false;
            for( int j = 0 ; j < qtd ; j++ ) {
                if( unicos[ j ] == Conc[ i ] ) {
                    existe = true;
                    break;
                }
            }
            if( !existe ) {
                unicos[ qtd++ ] = Conc[ i ];
            }
        }
        unicos = Arrays.copyOf( unicos , qtd );
	    System.out.println("\nOs valores integrados sem duplicidade são:");
        for(i = 0 ; i < unicos.length;i++) {
            System.out.printf("%4d", unicos[i]);
        }
			
	}

}

	
