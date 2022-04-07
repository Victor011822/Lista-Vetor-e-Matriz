import java.util.Scanner;

public class VetorEx6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int i,j,x;
		int A[] = new int[4];
		int checkSame=0;
		
		System.out.println("[+] Verificando a existência de valores repetidos ...");
		System.out.println("[+] Leitura do vetor V ");
		
		//leitura do vetorA
		for(i=0;i<A.length;i++) {
			System.out.println("[+] Digite um valor:["+i+"]");
			A[i]=input.nextInt();
		}
				
		String checked="[+] Valores repetido no vetor A:\n";
		for(i=0;i<A.length;i++) {
			checkSame=A[i];
			x=i;
			for(j=0;j<A.length;j++) {
				if(checkSame==A[j] && x!=j) {
					checked+=checkSame+"\n";
				}
			}
			
		}
		System.out.println(checked);
		System.out.println("\n[+] Exibicao do Vetor A:");
		for(i=0;i<A.length;i++) {
			System.out.printf("%4d",A[i]);
		}
	}


}
