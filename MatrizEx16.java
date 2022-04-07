
import java.util.Random;
import java.util.Scanner;

public class MatrizEx16 {


public static void main(String[] args) {
		
		String answer4now, cod;
		char answr4n;
		cod = "abcdABCD1237890987654321";

		Scanner scanner = new Scanner(System.in);
		char[][] prova = new char[3][10];
		char[] gabarito = { 'A', 'B', 'D', 'A', 'C', 'C', 'A', 'B', 'A', 'C' };

		boolean answerIsCorrect;
		boolean answerIsInAbcd = false;

		
		for (int i = 0; i < prova.length; i++) {
			System.out.printf("Prova do aluno %02d: ", i + 1);
			System.out.println("\nDigite suas respostas nas questões: ");
			System.out.println("As respostas tem que ser A, B, C e D; Onde todas valem 1.0 ponto.");
			for (int j = 0; j < prova[0].length; j++) {
				answer4now = cod;
				while (answer4now.length() != 1 || !answerIsInAbcd) {
					if (answer4now != cod) {
						System.out.println("Resposta incorreta. Tente novamente...");
						
					} 
					System.out.printf("Pergunta %02d: ", j + 1);
					answer4now = scanner.next();
					answerIsInAbcd = ex15AnswerIsAcceptable(answer4now);
				}
				answr4n = answer4now.toUpperCase().charAt(0);
				prova[i][j] = answr4n;
			}
			System.out.println();
		}

		
		int[] resultado = new int[prova.length];
		int somaAcertos;
		for (int aluno = 0; aluno < prova.length; aluno++) {
			somaAcertos = 0;
			for (int questao = 0; questao < prova[0].length; questao++) {
				answerIsCorrect = prova[aluno][questao] == gabarito[questao];
				if (answerIsCorrect) {
					somaAcertos++;
				}
			}

			resultado[aluno] = somaAcertos;
		}

		printMatriz2d(prova);
		

		System.out.println(
				"\nO total de acertos dos " + prova.length + " alunos num total de " + prova[0].length + " questoes: ");
		for (int i = 0; i < resultado.length; i++) {
			System.out.printf("Acertos do Aluno %02d: ", i + 1					);
			System.out.println(resultado[i]);
		}
		
		System.out.println("\nO Gabarito é: ");
		for (int q = 0; q < gabarito.length; q++) {
			char alt = gabarito[q];
			System.out.printf("Alternativa %02d): %s", q + 1, alt);
			System.out.println("");
		}
		
		
		System.out.println(
				"\nMédia dos " + prova.length + " alunos num total de 7 acertos ou mais... ");
		for (int i = 0; i < resultado.length; i++) {
			System.out.printf("\nMédia do Aluno %02d: ", i + 1					);
			if ( resultado[i] >= 7) {
				System.out.printf("Aprovado", resultado[i]);
				
			}
			else {
				System.out.printf("Reprovado", resultado[i] < 7);
			}
			
		}
		
	}

	protected static void separatorPrint(String sep, int qtd) {
		String repeated = new String(new char[qtd]).replace("\0", sep);
		System.out.println(repeated);
	}

	private static boolean ex15AnswerIsAcceptable(String resp) {
		char[] respostasAceitaveis = { 'A', 'B', 'C', 'D' };
		String respCompare;
		respCompare = resp.toUpperCase().strip();

		for (char ra : respostasAceitaveis) {
			if (String.valueOf(ra).equals(respCompare)) {
				return true;
			}
		}
		return false;
	}

	private static void printMatriz2d(char[][] array2d) {
		int i, j, numCols, numRows;

		
		numRows = array2d.length;
		numCols = array2d[0].length;

		for (i = 0; i < numRows; i++) {
			for (j = 0; j < numCols; j++) {
				System.out.printf("%s\t", array2d[i][j]);
			}
			System.out.println("");
		}
	}
	
	
}
