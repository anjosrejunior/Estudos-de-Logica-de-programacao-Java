import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        double raiz, n;

        System.out.print("Diga o número : ");
        n = scan.nextDouble();

        raiz = Math.sqrt(n);

        System.out.println("O valor da Raiz é igual à = " + (int)raiz);

        System.out.println("Número que mais se aproxima da Raiz " + (int)(raiz - 1));

        scan.close();
    }
}
