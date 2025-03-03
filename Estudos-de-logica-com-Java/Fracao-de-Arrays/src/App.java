import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        double[] lista1 = new double[20];
        double[] lista2 = new double[20];
        double[] lista3 = new double[20];
        double[] resultado = new double[20]; // Vetor final com preenchimento alternado

        // Preenchendo as listas com valores aleatórios
        for (int i = 0; i < 20; i++) {
            lista1[i] = random.nextDouble() * 10.0; // Números entre 0.0 e 10.0
            lista2[i] = random.nextDouble() * 10.0 + 1.0; // Números entre 1.0 e 11.0 (evita zero)
        }

        // Calculando o produto pelo inverso
        for (int i = 0; i < 20; i++) {
            lista3[i] = lista1[i] * (1.0 / lista2[i]);
        }

        // Preenchimento alternado
        int center = 9; // Centro do vetor
        int indiceLista3 = 0; // Índice para percorrer lista3

        for (int offset = 0; offset <= 10; offset++) {
            // Preenche o lado esquerdo
            if (center - offset >= 0 && indiceLista3 < 20) {
                resultado[center - offset] = lista3[indiceLista3];
                indiceLista3++;
            }
            // Preenche o lado direito, exceto se esbarrar com o direito
            if (center + offset < 20 && indiceLista3 < 20 && (center + offset != center - offset)) {
                resultado[center + offset] = lista3[indiceLista3];
                indiceLista3++;
            }
        }

        // Exibindo os vetores para verificação
        System.out.println("Lista1 (entrada):");
        for (double valor : lista1) {
            System.out.printf("%.2f ", valor);
        }
        System.out.println("\nLista2 (entrada):");
        for (double valor : lista2) {
            System.out.printf("%.2f ", valor);
        }
        System.out.println("\nLista3 (produto pelo inverso):");
        for (double valor : lista3) {
            System.out.printf("%.2f ", valor);
        }
        System.out.println("\nResultado (preenchimento alternado):");
        for (double valor : resultado) {
            System.out.printf("%.2f ", valor);
        }
    }  
}