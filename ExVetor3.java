import java.util.Scanner;

public class ExVetor3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int A[] = new int[20];
		int B[] = new int[20];
		int C[] = new int[20];
		int D[] = new int[20];
		int E[] = new int[20];
		int i;
		
		System.out.println("Leitura do vetor A:");
		for(i=0;i<B.length;i++) {
			System.out.println("Digite v["+i+"]:");
			A[i] = ent.nextInt(); // Leitura via nextInt
		}
		
		System.out.println("Leitura do vetor B:");
		for(i=0;i<B.length;i++) {
			System.out.println("Digite v["+i+"]:");
			B[i] = ent.nextInt(); // Leitura via nextInt
		}
		System.out.println("Criando o vetor C:");
		for(i=0;i<B.length;i++) {
			System.out.println("Leitura do vetor A - B:");
			for(i=0;i<B.length;i++) {
				C[i] = A[i]-B[i];
				System.out.printf("%4d", C[i]);
			}
		}
		System.out.println("\nCriando o vetor D:");
		for(i=0;i<B.length;i++) {
			System.out.println("Leitura do vetor A + B:");
			for(i=0;i<B.length;i++) {
				D[i] = A[i]+B[i];
				System.out.printf("%4d", D[i]);
			}
		}
		System.out.println("\nCriando o vetor E:");
		for(i=0;i<B.length;i++) {
			System.out.println("Leitura do vetor A * B:");
			for(i=0;i<B.length;i++) {
				E[i] = A[i]*B[i];
				System.out.printf("%4d", E[i]);
			}
		}

	}
		
}
	
