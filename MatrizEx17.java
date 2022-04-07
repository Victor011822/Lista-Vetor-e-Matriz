import java.util.Scanner;

public class MatrizEx17 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int mat[][] = new int[5][3];
        int i, j;
        int[] maioresDeCadaLinha = new int[10];
        int aux = 0;
        int indiceCont = -1;
        int nota;
        int[] aux1 = new int[10];
        int[] arrContNotas = new int[mat[0].length];

        for(i=0; i<5; i++) {
            for(j=0; j<3; j++) {
                System.out.println("Digite mat["+i+"]["+j+"]:");
                mat[i][j] = ent.nextInt();
            }
        }
        System.out.println("\nMatriz de 4x4 na tela:\n");
        for(i=0; i<5; i++) {
            for(j=0; j<3; j++) {
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.printf("\n");
        }
        for (i = 0; i < mat.length; i++) {
            nota = 10;
            for (j = 0; j < mat[0].length; j++) {
                if (mat[i][j] <= nota) {
                    indiceCont = j;
                    nota = mat[i][j];
                }
            }
            arrContNotas[indiceCont] += 1;
        }
        for (i = 0; i < arrContNotas.length; i++) {
            System.out.printf("Na 1ª PROVA, %d de %d alunos tiraram a menor nota", arrContNotas[i], mat.length);
            System.out.println("");
        }
    }
}


