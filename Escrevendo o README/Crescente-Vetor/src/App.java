import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vet = new int[20]; 
        int[] crescente = new int[20];
        Random random = new Random();

        System.out.println("Lista de números: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(20);
            System.out.print(vet[i] + " ");
        }

        // Copia e ordena
        for (int i = 0; i < vet.length; i++) {
            crescente[i] = vet[i];
        }
        Arrays.sort(crescente);

        System.out.println("\nNumeros em ordem crescente: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(crescente[i] + " ");  
        }
    }
}

