import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("É par ou impar? ");
        number = input.nextInt();

        String resultado = number%2 == 0 ? "É PAR" : "É IMPAR";
        System.out.println(resultado);
    }
}