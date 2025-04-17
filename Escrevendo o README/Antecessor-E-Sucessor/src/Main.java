import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Digite um número: ");
        number = input.nextInt();
        System.out.println("Antecessor: " + (number - 1));
        System.out.println("Sucessor: " + (number + 1));
    }
}