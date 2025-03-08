import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vet = new int[3];
        int[] vetInvertido = new int[3];

        // Inserindo valores no vetor vet
        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(30);;
        }

        int indiceInversao = 0;
        for (int i = vet.length - 1; i >= 0; i--) {
            vetInvertido[indiceInversao] = vet[i];
            indiceInversao++;
        }

        // Imprimindo os numeros do vetor vet
        System.out.println("----- Vetor -----");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

        // Imprimindo os numeros do vetor vetInvertido
        System.out.println("\n----- Vetor Invertido -----");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vetInvertido[i] + " ");
        }


    }
}