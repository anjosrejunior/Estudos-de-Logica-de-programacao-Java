import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int n, fatorial = 1;

        System.out.println("Escreva o número: ");
        n = scan.nextInt();

        for (int i = 1; i < n; i++) {
            fatorial = fatorial * (i+1);
        }

        System.out.println("Esse é o fatorial = " + fatorial);

        scan.close();
    }
}
