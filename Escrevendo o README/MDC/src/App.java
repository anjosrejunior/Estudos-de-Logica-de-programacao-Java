import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int MMC, MDC, a, b, R;

        System.out.println("----- Vamos encontrar o MMC -----");
        System.out.println();

        System.out.print("Diga o primeiro número: ");
        a = scan.nextInt();
        System.out.print("Diga o segundo número: ");
        b = scan.nextInt();

        while (a != 0) {
            R = b % a;
            b = a;
            a = R;
        }
        MDC = b;

        System.out.println("O Resultado do MDC é = " + MDC);
      
        scan.close();
    }
}
