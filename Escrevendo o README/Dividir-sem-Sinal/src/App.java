import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);

        int dividendo, divisor, quoeficiente = 0;

        System.out.print("Escreva o dividendo: ");
        dividendo = scan.nextInt();
        System.out.print("Escreva o divisor: ");
        divisor = scan.nextInt();


        while (dividendo >= divisor) {
            dividendo -= divisor;
            quoeficiente += 1;
        }

        System.out.println("O Quoeficiente é: " + quoeficiente);

        scan.close();
    }
}
