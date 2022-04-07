import java.util.Scanner;

public class VetorEx7 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[] A = new int[5];
		System.out.println("[+] Leitura de um vetor de 5 inteiros...");
		System.out.println("[+] Leitura do vetor A: ");
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um valor do Vetor A: ["+i+"]");
			A[i] = ent.nextInt();
		}

		System.out.println("[+] Mostrando o leque de opções: ");

		int opcao = -1;
		while (true) {
			System.out.println("Press [0] Para finalizar");
			System.out.println("Press [1] Para mostrar vetor original");
			System.out.println("Press [2] Para mostrar vetor original em ordem invertida");
			opcao = ent.nextInt();
			if (opcao == 0) {
				System.out.println("\nTentativa finalizada com sucesso!");
				break;
			} else {
				if (opcao == 1) {
					for (var val : A) {
						System.out.printf("%4d", val);
					}
					
				} else if (opcao == 2) {
					for (int i = A.length - 1; i >= 0; i--) {
						System.out.printf("%4d", A[i]);
					}
				} else if (opcao < 0 || opcao > 2) {
					System.out.println("\nComando não identificado, Tente Novamente.");
				}
				System.out.println("\n");
			}

		}
	}
}

