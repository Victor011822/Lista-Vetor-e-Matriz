
import java.util.Scanner;

public class ExVetor11 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int i;
        int v[] = new int[100]; 
        
        System.out.println("Vetor v, de 6 elementos...");
        System.out.println("Leitura do vetor V: ");
        for(i=0;i<v.length;i++) {
            System.out.println("Digite v["+i+"]:");
            v[i] = ent.nextInt(); 

        }
        System.out.println("\n\nVetor original: ");
        for(i=0;i<v.length;i++) {
            System.out.printf("%3d", v[i]);

        }
        System.out.println("\n\nVetor original invertido: ");
        for(i = v.length  - 1 ;i>=0;i--) {
            System.out.printf("%3d", v[i]);
        }
    }
}
