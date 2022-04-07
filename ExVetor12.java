import java.util.Scanner;

public class ExVetor12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int i, x, cont=0;
		int A[] = new int [10];
		System.out.println("[+] Leitura de um vetor de 10 inteiros...");
		System.out.println("[+] Leitura do vetor V: ");
		for (i=0;i<A.length;i++) {
			System.out.println("Digite o vetor["+i+"]");
			A[i]=input.nextInt();
		}
		
		
		System.out.println("\n[...] Verificando e imprimindo valores primos a seguir: ");
		for (i=0;i<=A.length-1;i++) {
			for(x=2;x<=A[i];x++) {
				if(A[i]%x==0) {
					cont=cont+1;
				}
			}
			if (cont<2) {
				System.out.printf("[+] O valor inteiro ["+A[i]+"] é um numero Primo localizado no index["+i+"]\n");
				cont=0;
			}
		}
		}		
	}

}
