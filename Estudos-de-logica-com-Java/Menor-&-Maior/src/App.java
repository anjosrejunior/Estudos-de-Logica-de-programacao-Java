import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n, maior, menor;

        System.out.println("Escreva um número: ");
        n = scan.nextInt();

        maior = n;
        menor = n;

        while (n != -1) {
            if (maior < n) {
                maior = n;
            }
            else if (menor > n) {
                menor = n;
            }
            System.out.println("Escreva um número: ");
            n = scan.nextInt();
        }

        System.out.println("Este é o maior número: " + maior);
        System.out.println("Este é o menor número: " + menor);

        scan.close();
    }
}
