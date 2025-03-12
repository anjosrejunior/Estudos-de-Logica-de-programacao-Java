import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] mat = new int[10][10];
        int[][] matInvertida = new int[10][10];

        // Preenchendo a matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // Rotacionado em 90 graus
        System.out.println("\nMatriz Invertida:");
        for (int j = 0; j < mat.length; j++) {
            for (int i = mat.length - 1; i >= 0; i--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}