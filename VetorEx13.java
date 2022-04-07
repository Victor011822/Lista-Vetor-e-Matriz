import java.util.Scanner;

public class VetorEx13 {

	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    int i;
	    int A[] = new int [5];
	    int B[] = new int [5];
	    int C[] = new int [5]; 
		System.out.println("[+] Leitura de um vetor de 10 inteiros...");
		System.out.println("[+] Leitura do vetor A: ");
	    for(i=0; i < A.length; i++) {
	      System.out.println("Digite os valores do vetor A["+i+"]");
	      A[i] = input.nextInt();
	    }
	    
	    System.out.println("\n[+] Leitura do vetor B: ");
	    for( i=0; i < B.length; i++) {
	    	System.out.println("Digite os valores do vetor B["+i+"]");
	      B[i] = input.nextInt();
	    }
	   
		System.out.println("\n[...] Verificando e imprimindo a intersecção dos valores entre o vetor A e B");
	    for( i=0; i < A.length; i++) {
	      for(int j=0; j < B.length; j++) {
	        if (A[i] == B[j]){
	          C[j] = A[i]; 
	          System.out.println("Faz intersecção: "+C[j]);
	        } 
	      }
	    }
	  }

}
