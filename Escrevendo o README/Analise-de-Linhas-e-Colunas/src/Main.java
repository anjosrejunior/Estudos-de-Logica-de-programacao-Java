import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] mat = new int[10][10];
        int[] maiores = new int[10];
        int[] menores = new int[10];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (maiores[i] < mat[i][j]) {
                    maiores[i] = mat[i][j];
                }
                if (menores[i] > mat[i][j]) {
                    menores[i] = mat[i][j];
                }
            }
        }

        System.out.println("----- Matriz -----");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n----- Maiores Números das Linhas -----");
        for (int i = 0; i < maiores.length; i++) {
            System.out.println("Maior número da linha" + i + ": " + maiores[i]);
        }

        System.out.println("\n----- Menores Números das Linhas -----");
        for (int i = 0; i < maiores.length; i++) {
            System.out.println("Maior número da linha" + i + ": " + maiores[i]);
        }
    }
}