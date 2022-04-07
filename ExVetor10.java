import java.util.Scanner;


public class ExVetor10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int i;
		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[10];
				
		//leitura do vetorA e B
		for(i=0;i<A.length;i++) {
			System.out.println("Digite um valor do Vetor A: ["+i+"]");
			A[i]=input.nextInt();
			System.out.println("Digite um valor do Vetor do Vetor B: ["+i+"]");
			B[i]=input.nextInt();
		}
		
		for(i=0;i<A.length;i+=2) {
			C[i]=A[i];
		}
		for(i=1;i<A.length;i+=2) {
			C[i]=B[i];
			}
		
		for(i=0;i<C.length;i++) {
			System.out.printf("\nIndex["+i+"] do Vetor C: %4d",C[i]);
		}
	}

}
