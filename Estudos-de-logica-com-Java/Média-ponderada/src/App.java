import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int n1, n2, n3, n4, n5;
        double mediaPonderada;

        System.out.println("Escreva suas notas: ");

        System.out.print("Primeira Nota: ");
        n1 = scan.nextInt();

        System.out.print("Segunda Nota: ");
        n2 = scan.nextInt();

        System.out.print("Terceira Nota: ");
        n3 = scan.nextInt();

        System.out.print("Quarta Nota: ");
        n4 = scan.nextInt();

        System.out.print("Quinta Nota: ");
        n5 = scan.nextInt();

        mediaPonderada = (double)((n1 * 1) + (n2 * 2) + (n3 * 3) + (n4 * 4) + (n5 * 5)) / 1 + 2 + 3 + 4 + 5;

        System.out.println("O valor da média ponderada é : " + mediaPonderada);

        scan.close();
    }
}
