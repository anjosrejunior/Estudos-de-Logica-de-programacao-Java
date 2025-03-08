import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] mat = new int[6][6];
        int a,b,c,d, resultado;

        int[][] matriz = {
                {0, 2, 11, 6, 15, 11, 1},
                {2, 0, 7, 12, 4, 2, 15},
                {11, 7, 0, 11, 8, 3, 13},
                {6, 12, 11, 0, 10, 2, 1},
                {15, 4, 8, 10, 0, 5, 13},
                {1, 2, 3, 2, 5, 0, 14},
                {1, 15, 13, 1, 13, 14, 0}
        };

        System.out.println("----- Matriz -----");
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 7; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        while (true) {
            System.out.println("Qual a sua localização?: ");
            System.out.print("Linha: ");
            a = scan.nextInt();
            System.out.print("Coluna: ");
            b = scan.nextInt();

            System.out.println("Para aonde você quer ir?: ");
            System.out.print("Linha: ");
            c = scan.nextInt();
            System.out.print("Coluna: ");
            d = scan.nextInt();

            // Condição de parada: origem e destino iguais
            if (a == c && b == d) {
                System.out.println("Origem e destino iguais. Programa encerrado!");
                break;
            }
        }

        // Programa em construção -----------------------------------------------

        scan.close();
    }
}