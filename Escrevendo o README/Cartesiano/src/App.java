import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double x, x1, x2, y, y1, y2, equacao;

        System.out.println("Me diga os numeros: ");
        System.out.print("X 1 = ");
        x1 = scan.nextDouble();

        System.out.print("X 2 = ");
        x2 = scan.nextDouble();
 
        System.out.print("Y 1 = ");
        y1 = scan.nextDouble();

        System.out.print("Y 2 = ");
        y2 = scan.nextDouble();

        x = x1 - x2; 
        y = y1 - y2;

        equacao = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        System.out.println(equacao);
        
        scan.close();
    }
}
