import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int n1, n2;
        
        System.out.println("----Vamos conferir se é primo!----");

        System.out.print("Escreva o primeiro número: ");
        n1 = scan.nextInt();

        System.out.print("Escreva o último número: ");
        n2 = scan.nextInt();

        if (n1 > n2) {
           int troca = n1;
           n1 = n2;
           n2 = troca; 
        }

        boolean primo = true;

        for (int i = n1+1; i <= n2; i++) {
            if (i == 2) {
                System.out.println(i + " ");
            }
            else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    } 
                    else {
                        primo = true;
                    }
                }
                if (primo) {
                    System.out.println(i + " ");
                }
            }
        }

        scan.close();
    }
}