import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] mat = new int[5][5];

        // Preenchendo a matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(5 + 1);
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

        // Imprimindo apenas a diagonal principal
        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                }
                else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        // Imprimindo apenas o triângulo superior à diagonal principal
        System.out.println("\nTriângulo superior à diagonal principal:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (j > i) {
                    System.out.print(mat[i][j] + " ");
                }
                else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        // Imprimindo apenas o triângulo infeior à diagonal principal
        System.out.println("\nTriângulo inferior à diagonal principal:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < i) {
                    System.out.print(mat[i][j] + " ");
                }
                else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        // Retirando apenas a diagonal principal
        System.out.println("\nRetirando a Diagonal principal:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i != j) {
                    System.out.print(mat[i][j] + " ");
                }
                else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        // Imprimindo apenas a diagonal secundária
        System.out.println("\nDiagonal secundária:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (j == mat.length - 1 - i) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        // Imprimindo apenas o triângulo superior à diagonal secundária
        System.out.println("\nTriângulo superior à diagonal secundária:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (j > mat.length - 1 - i) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        // Imprimindo apenas o triângulo inferior à diagonal secundária
        System.out.println("\nTriângulo inferior à diagonal secundária:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (j < mat.length - 1 - i) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        // Encontrando a diagonal secundária
        System.out.println("\nTudo exceto a diagonal secundária:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (j != mat.length - 1 - i) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}