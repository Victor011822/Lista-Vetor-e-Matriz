

import java.util.Scanner;

public class VetorEx2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int i; // i serão os índices do vetor
		int v[] = new int[5]; // declaração de um vetor em Java
		int variable;
		System.out.println("Pares ou impares em um vetor V de 12 inteiros...");
		System.out.println("Leitura do vetor V: ");
		for(i=0;i<v.length;i++) {
			System.out.println("Digite v["+i+"]:");
			v[i] = ent.nextInt(); // Leitura via nextInt
		}
		System.out.println("Impressão do vetor - Classificação em Par ou Ímpar");
		for(i=0;i<v.length;i++) {
			// System.out.printf("%5d", v[i]);
			if(v[i]%2==0)
				System.out.printf(" %5d - É par (CALCULO FEITO)", v[i] / 2);
			else System.out.printf(" %5d - É impar (CALCULO FEITO)", v[i] * 3);
		}
		}
	
	


}
