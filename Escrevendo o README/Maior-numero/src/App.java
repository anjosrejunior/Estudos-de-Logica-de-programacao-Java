import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int n, maior, menor;

        System.out.print("Diga quantos números você vai digitar?");
        n = scan.nextInt(); 
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Qual o número " + (i+1) + ": ");
            array [i] = scan.nextInt();
        }

        maior = array [0];
        for (int i = 0; i < n; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        menor = array [0];
        for (int i = 0; i < n; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }

        System.out.println("Este é o menor número: " + maior);
        System.out.println("Este é o menor número: " + menor);
        scan.close();
    }
}
