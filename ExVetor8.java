import java.util.Scanner;

public class ExVetor8 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int i,soma=0,media=0;
		int A[] = new int[8];
		
		System.out.println("[+] Soma e media dos 15 alunos ...");
		System.out.println("[+] Leitura do vetor V ");
		//leitura do vetorA
		for(i=0;i<A.length;i++) {
			System.out.println("[+] Digite uma nota:["+i+"]");
			A[i]=input.nextInt();
			soma=soma+A[i];
		}
		media=soma/A.length;
		System.out.printf("\n[+] A nota média é: %4d",media);
	}

}
