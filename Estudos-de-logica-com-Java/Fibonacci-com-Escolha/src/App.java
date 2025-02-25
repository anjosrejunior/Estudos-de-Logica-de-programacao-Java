import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int fibonacci, a, b;

        System.out.print("Qual o primeiro número = ");
        a = scan.nextInt();

        System.out.print("Qual o segundo número = ");
        b = scan.nextInt();

        if (a > b) {
            int troca = b;
            b = a;
            a = troca;
        }

        System.out.print(a + ", ");
        System.out.print(b + ", ");

        for (int i = 0; i <= 20; i++) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
            System.out.print(fibonacci + ", ");
        }

        scan.close();
    }
}
