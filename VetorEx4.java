import java.util.Scanner;

public class VetorEx4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int i; // i serão os índices do vetor
		int A[] = new int[6]; // declaração de um vetor em Java
		int B[] = new int[6];
		
		
		System.out.println("[+] Imprimindo os 6 vetores ...");
		System.out.println("[+] Leitura do vetor V ");
		for(i=0;i<A.length;i++) {
			System.out.println("Digite v["+i+"]:");
			A[i] = ent.nextInt(); // Leitura via nextInt
		}
		
		for(i=0;i<A.length;i++) {
			B[i] = A[0] + A[1] + A[5];
			System.out.printf("A soma dos vetores é: %d \n", B[i] );
			break;
		}
		System.out.println("\nModificando o Vetor A[4]:");
		A[4] = 100;
		for(i=0;i<A.length;i++) {
			System.out.println(A[i]);
			
		}

	}
}
