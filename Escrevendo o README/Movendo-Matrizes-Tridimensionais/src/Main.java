import java.util.Random;

public class Main{
    public static void main(String []args){
        Random random = new Random();

        int[][][] arrayTridimensional = new int[3][4][3];

        // Preencher o array com números aleatórios entre 0 e 99
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < 3; i++) {
                    arrayTridimensional[i][j][k] = random.nextInt(100); // Números de 0 a 99
                }
            }
        }

        // Mostrando a matriz gerada
        System.out.println("Matriz tridimensional: ");
        for (int k = 0; k < 3; k++) {
            System.out.println("Camada " + (k+1));
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(arrayTridimensional[i][j][k] +  " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Deslocamento de camadas (cíclico à direita) usando uma matriz temporária
        int[][] temp = new int[3][4];

        // Copiar a camada k = 2 (última camada) para a temporária
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                temp[i][j] = arrayTridimensional[i][j][2];
            }
        }

        // Delocamento de camadas
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                arrayTridimensional[i][j][0] = arrayTridimensional[i][j][1]; // k = 0 -> k = 1
                arrayTridimensional[i][j][1] = temp[i][j]; // k = 1 -> k = 2
                arrayTridimensional[i][j][2] = arrayTridimensional[i][j][0]; // k = 2 -> k = 0
            }
        }

        // Printando mudanças
        System.out.println("Deslocamento aplicado: ");
        for (int k = 0; k < 3; k++) {
            System.out.println("Camada " + (k+1));
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(arrayTridimensional[i][j][k] +  " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}