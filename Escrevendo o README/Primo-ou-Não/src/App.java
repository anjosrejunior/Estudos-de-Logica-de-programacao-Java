import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int n;
        
        System.out.println("----Vamos conferir se é primo!----");

        System.out.print("Escreva o número: ");
        n = scan.nextInt();

        if (n == 2 || n == 1) {
            System.out.println("O número é primo!");
        }
        else {
            for (int i = 2; i < (int)Math.sqrt(n); i++) {
                if (i % n == 0) {
                    System.out.println("Não é primo!");
                }
                else {
                    System.out.println("É primo!");
                }
            }
        }

        scan.close();
    }
}
