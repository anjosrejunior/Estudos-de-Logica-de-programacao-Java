import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int a = 0,b = 0,c = 0;
        double delta, baskaraPositivo, baskaraNegativo;
        
        System.out.println("Me diz ai os números");

        System.out.print("A = ");
        a = scan.nextInt();

        System.out.print("B = ");
        b = scan.nextInt();

        System.out.print("C = ");
        c = scan.nextInt();

        delta = Math.pow(b,2) - 4*a*c;

        System.out.println("Delta = " + delta);

        baskaraPositivo = (-b + Math.sqrt(delta)) / (2*a);
        baskaraNegativo = (-b - Math.sqrt(delta)) / (2*a);

        System.out.println("Baskara P = " + baskaraPositivo);
        System.out.println("Baskara P = " + baskaraNegativo);

        scan.close();
    }
}
