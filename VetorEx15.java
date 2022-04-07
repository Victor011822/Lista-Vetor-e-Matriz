import java.util.Scanner;

public class VetorEx15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int i;
		int count = 0;
		int cont = 0;
		int A[] = new int[5];
		int newArr[] = new int[A.length];
		
		
		System.out.println("[+] Leitura de um vetor de 15 inteiros...");
		System.out.println("[+] Leitura do vetor A: ");			
		//leitura do vetorA e B
		for(i=0;i<A.length;i++) {
			System.out.println("Digite um valor do Vetor A: ["+i+"]");
			A[i]=input.nextInt();
		}
		for (i = 0; i < A.length; i++) {
			if (A[i] != 0) {
				newArr[i] = A[i];
			} else {
				count++;
			}
		}
		System.out.printf("\n[+] Aplicando a regra de remoção dos valores 0:\n");
		int[] finalArr = new int[A.length - count];
		for (i = 0; i < A.length; i++) {
			if (A[i] != 0) {
				finalArr[cont] = A[i];
				cont++;
				System.out.printf("[+] Aplicando lógica: ");
				System.out.println(A[i]);
			}

		}
	}
}
