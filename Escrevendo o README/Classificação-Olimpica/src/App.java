import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int bronze, prata, ouro;
        double mediaPonderada;

        System.out.println("----- Verificador de classificação olímpica -----");
        System.out.print("Diga quantas medalhas de bronze: ");
        bronze = scan.nextInt();
        System.out.print("Diga quantas medalhas de prata: ");
        prata = scan.nextInt();
        System.out.print("Diga quantas medalhas de ouro: ");
        ouro = scan.nextInt();

        mediaPonderada = (double)(bronze * 1 + prata * 2 + ouro * 3) / (1+2+3);
        
        System.out.println("A classificação olímpica é: " + mediaPonderada);

        scan.close();
    }
}
