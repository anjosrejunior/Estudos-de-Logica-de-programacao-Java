import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] mat = new int[5][5];
        int[] vetTroca = new int[5];
        int[] vetTroca2 = new int[5];

        // Preenchendo a matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(5+1);
            }
        }

        // Imprimindo a Matriz
        System.out.println("Imprimindo a Matriz: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // Invertendo a segunda linha pela quinta linha
        for (int j = 0; j < mat.length; j++) {
            vetTroca[j] = mat[1][j];
            mat[1][j] = mat[4][j];
            mat[4][j] = vetTroca[j];
        }

        // Imprimindo a Matriz - Inverão da segunda pela quinta linha
        System.out.println("\nInversão linha 2 pela 5: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // Invertendo a primeira coluna pela quarta coluna
        for (int i = 0; i < mat.length; i++) {
            vetTroca[i] = mat[i][0];
            mat[i][0] = mat[i][3];
            mat[i][3] = vetTroca[i];
        }

        // Imprimindo a Matriz - Inverão da primeira pela quarta coluna
        System.out.println("\nInversão coluna 1 pela 4: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // Copiando as diagonais
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    vetTroca[i] = mat[i][j];
                }
                if (j == mat.length - 1 - i) {
                    vetTroca2[i] = mat[i][j];
                }
            }
        }

        // Invertendo as diagonais
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                     mat[i][j] = vetTroca2[i];
                }
                if (j == mat.length - 1 - i) {
                    mat[i][j] = vetTroca[i];
                }
            }
        }

        // Imprimindo a Matriz - Inverão das diagonais
        System.out.println("\nInversão das diagonais: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}