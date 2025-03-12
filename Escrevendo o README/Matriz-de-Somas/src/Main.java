import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] mat = new int[5][5];

        // Preenchendo a matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(5);
            }
        }

        // Somando todos os Ímpares
        int somaImpares = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] % 2 != 0) {
                    somaImpares += mat[i][j];
                }
            }
        }

        // Somando as cinco colunas
        int[] somaColunas = new int[5];
        for (int j = 0; j < mat.length; j++) {
            for (int i = 0; i < mat.length; i++) {
                somaColunas[j] += mat[i][j];
            }
        }

        // Somando as linhas
        int[] somaLinhas = new int[5];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                somaLinhas[i] += mat[i][j];
            }
        }

        // Exibindo os resultados
        System.out.println("Soma dos ímpares: " + somaImpares);
        for (int j = 0; j < 5; j++) {
            System.out.println("Soma da coluna " + j + ": " + somaColunas[j]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Soma da linha " + i + ": " + somaLinhas[i]);
        }

    }
}